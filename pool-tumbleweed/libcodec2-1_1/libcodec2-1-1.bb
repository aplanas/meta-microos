SUMMARY = "Low bit rate speech codec"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.1.1"

RPM_NAME = "libcodec2-1_1-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "c74b1183561f493113121c73d9a7f78f7f3780e24b4d586c7d4163beb345e83a657ca6ca0aecc0d7258c66802032748ae62ea07041a0d8d897d81d73f8bf4ad3"

RPROVIDES:${PN} += "libcodec2-1-1 \
libcodec2.so.1.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
