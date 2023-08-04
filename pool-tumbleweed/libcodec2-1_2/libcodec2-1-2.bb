SUMMARY = "Low bit rate speech codec"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "libcodec2-1_2-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "0393f8175f86d1eb40c339981a32152e53cafd0f9319495f0774c03697e9201acce83474301830b7a8c42350023bed3882d185e728705ee133ee8c9c989ada57"

RPROVIDES:${PN} += "libcodec2-1-2 \
libcodec2.so.1.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
