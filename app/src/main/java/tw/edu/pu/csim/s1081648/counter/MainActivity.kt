package tw.edu.pu.csim.s1081648.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    var number:Int = 0;
    fun addone(v: View){
        number++;
        txv.text = number.toString()
    }
}

