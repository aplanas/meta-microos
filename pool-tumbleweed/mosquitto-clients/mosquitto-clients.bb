SUMMARY = "Client for Mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
This makes it suitable for 'machine to machine' messaging such as with low \
power sensors or mobile devices such as phones, embedded computers or \
microcontrollers like the Arduino. A good example of this is all of the work \
that Andy Stanford-Clark (one of the originators of MQTT) has done in home \
monitoring and automation with his twittering house and twittering ferry. \
 \
Client for Mosquitto."
LICENSE = "EPL-1.0"

PV = "2.0.15"

RPM_NAME = "mosquitto-clients-2.0.15-1.5.aarch64.rpm"
RPM_HASH = "b37659620b32eb789536f7318712f20aafe8c966a651d4e99d1d60fb66f0067f3f43f292eb1c424f8646f4c4007782f212bc1f5261b7952c1ed8516c8d46ee4d"

RPROVIDES:${PN} += "mosquitto-clients"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcjson.so.1 \
libmosquitto.so.1"

inherit rpm
