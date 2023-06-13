SUMMARY = "Shared C Library for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the shared C library."
LICENSE = "EPL-1.0"

PV = "2.0.15"

RPM_NAME = "libmosquitto1-2.0.15-1.4.aarch64.rpm"
RPM_HASH = "102f9351e5131657f16acbfdb1b85eee6ed098bc4c2b42499ebe54973ce8054b216021d5d444bc1e44cbd39276bfef7a6d3d195e700308e0910a683b19a366b5"

RPROVIDES:${PN} += "libmosquitto.so.1()(64bit) \
libmosquitto1 \
libmosquitto1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
