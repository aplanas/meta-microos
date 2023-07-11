SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "libsyn123-0-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "eb304b55e7e18fc25ed94d6e3d749e7cac94abd896980c36db56991420f8a77b1336552db09a1b24f160ec3d302e77b58b899e6207860c1dbd54713a15cd7f9f"

RPROVIDES:${PN} += "libsyn123-0 \
libsyn123.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
