SUMMARY = "Animated sprite editor & pixel art tool"
DESCRIPTION = "LibreSprite is an open source program to create animated sprites \
for websites and games."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.0"

RPM_NAME = "libresprite-1.0-2.2.aarch64.rpm"
RPM_HASH = "1160a82aa61666f62f2ca03ea508d7b25884d51a24edb008c45e9ea708b1967e9d9984b79ffe1fb90a144d3563b73154bfdb33bba83d79b7577350a413d58ef5"

RPROVIDES:${PN} += "libresprite"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libjpeg.so.8 \
liblua5.3.so.5 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtinyxml.so.0 \
libwebp.so.7 \
libxcb.so.1 \
libz.so.1"

inherit rpm
