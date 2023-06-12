SUMMARY = "High-level repository for sensors that use mraa"
DESCRIPTION = "The UPM repository provides software drivers for a wide variety of commonly \
used sensors and actuators. These software drivers interact with the \
underlying hardware platform (or microcontroller), as well as with the \
attached sensors, through calls to MRAA APIs. \
 \
This package contains shared library for upm."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "libupm1-2.0.0-4.1.aarch64.rpm"
RPM_HASH = "28fd2537d8b4e41b7877a2b7234b3d979860e2fa4156a15fb74cdefaba46085a5dbfd93638b75c624e13ce9f82895bb545514fe415947c77935c2776d8880115"

RPROVIDES:${PN} += "libupm-2jciebu01_usb.so.1()(64bit) \
libupm-a110x.so.1()(64bit) \
libupm-abp.so.1()(64bit) \
libupm-ad8232.so.1()(64bit) \
libupm-adafruitms1438.so.1()(64bit) \
libupm-adafruitss.so.1()(64bit) \
libupm-adc121c021.so.1()(64bit) \
libupm-adis16448.so.1()(64bit) \
libupm-ads1x15.so.1()(64bit) \
libupm-adxl335.so.1()(64bit) \
libupm-adxl345.so.1()(64bit) \
libupm-adxrs610.so.1()(64bit) \
libupm-am2315.so.1()(64bit) \
libupm-apa102.so.1()(64bit) \
libupm-apds9002.so.1()(64bit) \
libupm-apds9930.so.1()(64bit) \
libupm-at42qt1070.so.1()(64bit) \
libupm-bh1749.so.1()(64bit) \
libupm-bh1750.so.1()(64bit) \
libupm-bh1792.so.1()(64bit) \
libupm-biss0001.so.1()(64bit) \
libupm-bma220.so.1()(64bit) \
libupm-bma250e.so.1()(64bit) \
libupm-bmg160.so.1()(64bit) \
libupm-bmi160.so.1()(64bit) \
libupm-bmm150.so.1()(64bit) \
libupm-bmp280.so.1()(64bit) \
libupm-bmpx8x.so.1()(64bit) \
libupm-bmx055.so.1()(64bit) \
libupm-bno055.so.1()(64bit) \
libupm-button.so.1()(64bit) \
libupm-buzzer.so.1()(64bit) \
libupm-cjq4435.so.1()(64bit) \
libupm-collision.so.1()(64bit) \
libupm-cwlsxxa.so.1()(64bit) \
libupm-dfrec.so.1()(64bit) \
libupm-dfrorp.so.1()(64bit) \
libupm-dfrph.so.1()(64bit) \
libupm-ds1307.so.1()(64bit) \
libupm-ds1808lc.so.1()(64bit) \
libupm-ds18b20.so.1()(64bit) \
libupm-ds2413.so.1()(64bit) \
libupm-ecezo.so.1()(64bit) \
libupm-ecs1030.so.1()(64bit) \
libupm-ehr.so.1()(64bit) \
libupm-eldriver.so.1()(64bit) \
libupm-electromagnet.so.1()(64bit) \
libupm-emg.so.1()(64bit) \
libupm-enc03r.so.1()(64bit) \
libupm-flex.so.1()(64bit) \
libupm-gas.so.1()(64bit) \
libupm-gp2y0a.so.1()(64bit) \
libupm-gprs.so.1()(64bit) \
libupm-gsr.so.1()(64bit) \
libupm-guvas12d.so.1()(64bit) \
libupm-h3lis331dl.so.1()(64bit) \
libupm-hcsr04.so.1()(64bit) \
libupm-hdc1000.so.1()(64bit) \
libupm-hdxxvxta.so.1()(64bit) \
libupm-hka5.so.1()(64bit) \
libupm-hlg150h.so.1()(64bit) \
libupm-hm11.so.1()(64bit) \
libupm-hmc5883l.so.1()(64bit) \
libupm-hmtrp.so.1()(64bit) \
libupm-hp20x.so.1()(64bit) \
libupm-ht9170.so.1()(64bit) \
libupm-htu21d.so.1()(64bit) \
libupm-hx711.so.1()(64bit) \
libupm-ili9341.so.1()(64bit) \
libupm-ims.so.1()(64bit) \
libupm-ina132.so.1()(64bit) \
libupm-interfaces.so.1()(64bit) \
libupm-isd1820.so.1()(64bit) \
libupm-itg3200.so.1()(64bit) \
libupm-jhd1313m1.so.1()(64bit) \
libupm-joystick12.so.1()(64bit) \
libupm-kx122.so.1()(64bit) \
libupm-kxcjk1013.so.1()(64bit) \
libupm-kxtj3.so.1()(64bit) \
libupm-l298.so.1()(64bit) \
libupm-l3gd20.so.1()(64bit) \
libupm-lcd.so.1()(64bit) \
libupm-lcdks.so.1()(64bit) \
libupm-lcm1602.so.1()(64bit) \
libupm-ldt0028.so.1()(64bit) \
libupm-led.so.1()(64bit) \
libupm-lidarlitev3.so.1()(64bit) \
libupm-light.so.1()(64bit) \
libupm-linefinder.so.1()(64bit) \
libupm-lis2ds12.so.1()(64bit) \
libupm-lis3dh.so.1()(64bit) \
libupm-lm35.so.1()(64bit) \
libupm-lol.so.1()(64bit) \
libupm-loudness.so.1()(64bit) \
libupm-lp8860.so.1()(64bit) \
libupm-lpd8806.so.1()(64bit) \
libupm-lsm303agr.so.1()(64bit) \
libupm-lsm303d.so.1()(64bit) \
libupm-lsm303dlh.so.1()(64bit) \
libupm-lsm6ds3h.so.1()(64bit) \
libupm-lsm6dsl.so.1()(64bit) \
libupm-lsm9ds0.so.1()(64bit) \
libupm-m24lr64e.so.1()(64bit) \
libupm-mag3110.so.1()(64bit) \
libupm-max30100.so.1()(64bit) \
libupm-max31723.so.1()(64bit) \
libupm-max31855.so.1()(64bit) \
libupm-max44000.so.1()(64bit) \
libupm-max44009.so.1()(64bit) \
libupm-max5487.so.1()(64bit) \
libupm-maxds3231m.so.1()(64bit) \
libupm-maxsonarez.so.1()(64bit) \
libupm-mb704x.so.1()(64bit) \
libupm-mcp2515.so.1()(64bit) \
libupm-mcp9808.so.1()(64bit) \
libupm-md.so.1()(64bit) \
libupm-mg811.so.1()(64bit) \
libupm-mhz16.so.1()(64bit) \
libupm-mic.so.1()(64bit) \
libupm-micsv89.so.1()(64bit) \
libupm-mlx90614.so.1()(64bit) \
libupm-mma7361.so.1()(64bit) \
libupm-mma7455.so.1()(64bit) \
libupm-mma7660.so.1()(64bit) \
libupm-mma8x5x.so.1()(64bit) \
libupm-mmc35240.so.1()(64bit) \
libupm-moisture.so.1()(64bit) \
libupm-mpl3115a2.so.1()(64bit) \
libupm-mpr121.so.1()(64bit) \
libupm-mpu9150.so.1()(64bit) \
libupm-mq303a.so.1()(64bit) \
libupm-ms5611.so.1()(64bit) \
libupm-ms5803.so.1()(64bit) \
libupm-my9221.so.1()(64bit) \
libupm-nlgpio16.so.1()(64bit) \
libupm-nmea_gps.so.1()(64bit) \
libupm-nrf24l01.so.1()(64bit) \
libupm-nrf8001.so.1()(64bit) \
libupm-nunchuck.so.1()(64bit) \
libupm-o2.so.1()(64bit) \
libupm-otp538u.so.1()(64bit) \
libupm-p9813.so.1()(64bit) \
libupm-pca9685.so.1()(64bit) \
libupm-pn532.so.1()(64bit) \
libupm-ppd42ns.so.1()(64bit) \
libupm-pulsensor.so.1()(64bit) \
libupm-relay.so.1()(64bit) \
libupm-rf22.so.1()(64bit) \
libupm-rfr359f.so.1()(64bit) \
libupm-rgbringcoder.so.1()(64bit) \
libupm-rhusb.so.1()(64bit) \
libupm-rn2903.so.1()(64bit) \
libupm-rotary.so.1()(64bit) \
libupm-rotaryencoder.so.1()(64bit) \
libupm-rpr220.so.1()(64bit) \
libupm-rsc.so.1()(64bit) \
libupm-scam.so.1()(64bit) \
libupm-sensortemplate.so.1()(64bit) \
libupm-servo.so.1()(64bit) \
libupm-sht1x.so.1()(64bit) \
libupm-si1132.so.1()(64bit) \
libupm-si114x.so.1()(64bit) \
libupm-si7005.so.1()(64bit) \
libupm-slide.so.1()(64bit) \
libupm-sm130.so.1()(64bit) \
libupm-smartdrive.so.1()(64bit) \
libupm-speaker.so.1()(64bit) \
libupm-ssd1351.so.1()(64bit) \
libupm-st7735.so.1()(64bit) \
libupm-stepmotor.so.1()(64bit) \
libupm-sx1276.so.1()(64bit) \
libupm-sx6119.so.1()(64bit) \
libupm-t6713.so.1()(64bit) \
libupm-ta12200.so.1()(64bit) \
libupm-tca9548a.so.1()(64bit) \
libupm-tcs3414cs.so.1()(64bit) \
libupm-tcs37727.so.1()(64bit) \
libupm-teams.so.1()(64bit) \
libupm-temperature.so.1()(64bit) \
libupm-tex00.so.1()(64bit) \
libupm-th02.so.1()(64bit) \
libupm-tm1637.so.1()(64bit) \
libupm-tmp006.so.1()(64bit) \
libupm-tsl2561.so.1()(64bit) \
libupm-ttp223.so.1()(64bit) \
libupm-uartat.so.1()(64bit) \
libupm-uln200xa.so.1()(64bit) \
libupm-ultrasonic.so.1()(64bit) \
libupm-urm37.so.1()(64bit) \
libupm-utilities.so.1()(64bit) \
libupm-vcap.so.1()(64bit) \
libupm-vdiv.so.1()(64bit) \
libupm-veml6070.so.1()(64bit) \
libupm-water.so.1()(64bit) \
libupm-waterlevel.so.1()(64bit) \
libupm-wfs.so.1()(64bit) \
libupm-wheelencoder.so.1()(64bit) \
libupm-wt5001.so.1()(64bit) \
libupm-xbee.so.1()(64bit) \
libupm-yg1006.so.1()(64bit) \
libupm-zfm20.so.1()(64bit) \
libupm1 \
libupm1(aarch-64) \
libupmc-a110x.so.1()(64bit) \
libupmc-abp.so.1()(64bit) \
libupmc-ad8232.so.1()(64bit) \
libupmc-apa102.so.1()(64bit) \
libupmc-bh1749.so.1()(64bit) \
libupmc-bh1750.so.1()(64bit) \
libupmc-bh1792.so.1()(64bit) \
libupmc-biss0001.so.1()(64bit) \
libupmc-bma250e.so.1()(64bit) \
libupmc-bmg160.so.1()(64bit) \
libupmc-bmi160.so.1()(64bit) \
libupmc-bmm150.so.1()(64bit) \
libupmc-bmp280.so.1()(64bit) \
libupmc-bmpx8x.so.1()(64bit) \
libupmc-bno055.so.1()(64bit) \
libupmc-button.so.1()(64bit) \
libupmc-buzzer.so.1()(64bit) \
libupmc-cjq4435.so.1()(64bit) \
libupmc-collision.so.1()(64bit) \
libupmc-dfrec.so.1()(64bit) \
libupmc-dfrorp.so.1()(64bit) \
libupmc-dfrph.so.1()(64bit) \
libupmc-ds18b20.so.1()(64bit) \
libupmc-ecezo.so.1()(64bit) \
libupmc-emg.so.1()(64bit) \
libupmc-enc03r.so.1()(64bit) \
libupmc-flex.so.1()(64bit) \
libupmc-gas.so.1()(64bit) \
libupmc-gp2y0a.so.1()(64bit) \
libupmc-gsr.so.1()(64bit) \
libupmc-guvas12d.so.1()(64bit) \
libupmc-hcsr04.so.1()(64bit) \
libupmc-hka5.so.1()(64bit) \
libupmc-hmc5883l.so.1()(64bit) \
libupmc-ims.so.1()(64bit) \
libupmc-jhd1313m1.so.1()(64bit) \
libupmc-joystick12.so.1()(64bit) \
libupmc-kx122.so.1()(64bit) \
libupmc-kxtj3.so.1()(64bit) \
libupmc-lcdks.so.1()(64bit) \
libupmc-lcm1602.so.1()(64bit) \
libupmc-ldt0028.so.1()(64bit) \
libupmc-led.so.1()(64bit) \
libupmc-light.so.1()(64bit) \
libupmc-linefinder.so.1()(64bit) \
libupmc-lis2ds12.so.1()(64bit) \
libupmc-lis3dh.so.1()(64bit) \
libupmc-lm35.so.1()(64bit) \
libupmc-loudness.so.1()(64bit) \
libupmc-lsm303agr.so.1()(64bit) \
libupmc-lsm303d.so.1()(64bit) \
libupmc-lsm6ds3h.so.1()(64bit) \
libupmc-lsm6dsl.so.1()(64bit) \
libupmc-m24lr64e.so.1()(64bit) \
libupmc-max30100.so.1()(64bit) \
libupmc-mb704x.so.1()(64bit) \
libupmc-mcp2515.so.1()(64bit) \
libupmc-md.so.1()(64bit) \
libupmc-mic.so.1()(64bit) \
libupmc-mma7361.so.1()(64bit) \
libupmc-mma7660.so.1()(64bit) \
libupmc-moisture.so.1()(64bit) \
libupmc-mpr121.so.1()(64bit) \
libupmc-mq303a.so.1()(64bit) \
libupmc-ms5803.so.1()(64bit) \
libupmc-my9221.so.1()(64bit) \
libupmc-nmea_gps.so.1()(64bit) \
libupmc-nunchuck.so.1()(64bit) \
libupmc-o2.so.1()(64bit) \
libupmc-otp538u.so.1()(64bit) \
libupmc-p9813.so.1()(64bit) \
libupmc-ppd42ns.so.1()(64bit) \
libupmc-relay.so.1()(64bit) \
libupmc-rn2903.so.1()(64bit) \
libupmc-rotary.so.1()(64bit) \
libupmc-rotaryencoder.so.1()(64bit) \
libupmc-rpr220.so.1()(64bit) \
libupmc-rsc.so.1()(64bit) \
libupmc-servo.so.1()(64bit) \
libupmc-sht1x.so.1()(64bit) \
libupmc-slide.so.1()(64bit) \
libupmc-speaker.so.1()(64bit) \
libupmc-temperature.so.1()(64bit) \
libupmc-tsl2561.so.1()(64bit) \
libupmc-ttp223.so.1()(64bit) \
libupmc-uartat.so.1()(64bit) \
libupmc-uln200xa.so.1()(64bit) \
libupmc-urm37.so.1()(64bit) \
libupmc-utilities.so.1()(64bit) \
libupmc-vdiv.so.1()(64bit) \
libupmc-veml6070.so.1()(64bit) \
libupmc-water.so.1()(64bit) \
libupmc-wfs.so.1()(64bit) \
libupmc-yg1006.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmraa.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm