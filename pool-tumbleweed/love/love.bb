SUMMARY = "2D gaming engine written in Lua"
DESCRIPTION = "LÖVE is a framework for making 2D games in Lua."
LICENSE = "Zlib"

PV = "11.4"

RPM_NAME = "love-11.4-2.5.aarch64.rpm"
RPM_HASH = "5d6e0969c369433117392d88976e9fd66bb5471b02a2f95ee45c0c96b33af98fe9bef52454b7f640d072f36da2756ab00b8a1d0ea439152c368e3d856666fdd4"

RPROVIDES:${PN} += "liblove-11.4.so \
love"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libmodplug.so.1 \
libmpg123.so.0 \
libogg.so.0 \
libopenal.so.1 \
libstdc++.so.6 \
libtheoradec.so.1 \
libvorbisfile.so.3 \
libz.so.1 \
shared-mime-info"

inherit rpm
