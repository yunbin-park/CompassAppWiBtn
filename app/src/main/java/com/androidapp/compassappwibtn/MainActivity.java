package com.androidapp.compassappwibtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnOpenCompass;
    Intent intentCompassActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenCompass = findViewById(R.id.btnOpenCompassView);
        btnOpenCompass.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnOpenCompassView:
                intentCompassActivity = new Intent(this, CompassActivity.class);
                startActivity(intentCompassActivity); break;
            default: break;
        }

    }
}