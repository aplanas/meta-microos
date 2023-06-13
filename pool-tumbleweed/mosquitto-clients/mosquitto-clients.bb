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

RPM_NAME = "mosquitto-clients-2.0.15-1.4.aarch64.rpm"
RPM_HASH = "580f0bd9956409c31b44573aa2e4e437696c5fac1f8dd9254f5c05ddd0d11e2e65a2bed3b3b2bedb99417ac57eb74edc4d0556e2943af728d01451ffd2e1355e"

RPROVIDES:${PN} += "mosquitto-clients \
mosquitto-clients(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcjson.so.1()(64bit) \
libmosquitto.so.1()(64bit)"

inherit rpm
