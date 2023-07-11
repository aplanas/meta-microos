SUMMARY = "Animated sprite editor & pixel art tool"
DESCRIPTION = "LibreSprite is an open source program to create animated sprites \
for websites and games."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.0"

RPM_NAME = "libresprite-1.0-2.3.aarch64.rpm"
RPM_HASH = "afd3e9c26817155d4aa31c737be35916852efbd761fae905eddd37de5a1077d3ac759db3759da0fa898cf9a9d061760516df3a472915587d7feca74d96348577"

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
