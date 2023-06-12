SUMMARY = "A MQTT v3.1/v3.1.1 Broker"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
This makes it suitable for 'machine to machine' messaging such as with low \
power sensors or mobile devices such as phones, embedded computers or \
microcontrollers like the Arduino. A good example of this is all of the work \
that Andy Stanford-Clark (one of the originators of MQTT) has done in home \
monitoring and automation with his twittering house and twittering ferry."
LICENSE = "EPL-1.0"

PV = "2.0.15"

RPM_NAME = "mosquitto-2.0.15-1.4.aarch64.rpm"
RPM_HASH = "9bc2ecf14bda975459d8666443e0f2e202867778e3d5c59bcc97402cae40af1576528e203226f7a8d8e69dcfcfd4522657e5c14c7f5e342f9b97747a2d9865c9"

RPROVIDES:${PN} += "config(mosquitto) \
mosquitto \
mosquitto(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcjson.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmosquitto.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libwebsockets.so.19()(64bit) \
libwrap.so.0()(64bit) \
shadow"

inherit rpm
