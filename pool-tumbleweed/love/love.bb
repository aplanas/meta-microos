SUMMARY = "2D gaming engine written in Lua"
DESCRIPTION = "LÖVE is a framework for making 2D games in Lua."
LICENSE = "Zlib"

PV = "11.4"

RPM_NAME = "love-11.4-2.6.aarch64.rpm"
RPM_HASH = "f414a68330bcad8df4426a2c182a0586e4fc2262c664d917b39dc31759454f79a47fc52dbb389e7cf4c01664bbea9748c3c0a5a682fe4957b34fe9de1293103f"

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
