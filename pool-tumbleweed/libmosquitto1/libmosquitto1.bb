SUMMARY = "Shared C Library for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the shared C library."
LICENSE = "EPL-1.0"

PV = "2.0.15"

RPM_NAME = "libmosquitto1-2.0.15-1.5.aarch64.rpm"
RPM_HASH = "2465d668f68a131eacb465245c41431e75f17a374ad72af786a4cc8871563edb1319528322fcf56acafcc175d4a839ec377124fcdcd080720aa29eaa99cfcccd"

RPROVIDES:${PN} += "libmosquitto.so.1 \
libmosquitto1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
