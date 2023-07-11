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

RPM_NAME = "mosquitto-2.0.15-1.5.aarch64.rpm"
RPM_HASH = "975e042ddbd9dfaa6fe66ce5f3690f65abf94bfa402568dd52f5d50353399a85df26eb2759a0ebb16628d025580150d2fab4e8bc73eb2b31a713ecb3ae03c923"

RPROVIDES:${PN} += "config-mosquitto \
mosquitto"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcjson.so.1 \
libcrypto.so.3 \
libm.so.6 \
libmosquitto.so.1 \
libssl.so.3 \
libwebsockets.so.19 \
libwrap.so.0 \
shadow"

inherit rpm
