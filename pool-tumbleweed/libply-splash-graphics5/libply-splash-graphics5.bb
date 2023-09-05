SUMMARY = "Plymouth graphics libraries"
DESCRIPTION = "This package contains the libply-splash-graphics library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-graphics5-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "61e9f7c51bcdfa333d19aead368b097d9bc535395d875102796a1d64dc100df15aea4125c4f6ad4f1e4b921f87984b5a08bc70dce0155dd111d03908dda696be"

RPROVIDES:${PN} += "libply-splash-graphics.so.5 \
libply-splash-graphics5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5 \
libpng16.so.16"

inherit rpm
