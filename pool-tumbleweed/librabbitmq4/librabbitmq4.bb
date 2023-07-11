SUMMARY = "Client library for AMQP"
DESCRIPTION = "This is a C-language AMQP client library for use with AMQP servers \
speaking protocol versions 0-9-1."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "librabbitmq4-0.13.0-2.1.aarch64.rpm"
RPM_HASH = "7d1ea55e009ac2a90367553b91559a83763bbaa677789fb20d5b01a99841a2458dc96e7551c1fc42aef1d89443bd663325de627357bac19d2131c0c064247b6d"

RPROVIDES:${PN} += "librabbitmq.so.4 \
librabbitmq4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
