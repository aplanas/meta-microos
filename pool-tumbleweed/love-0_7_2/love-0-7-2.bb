SUMMARY = "2D gaming engine written in Lua"
DESCRIPTION = "LÖVE is a framework for making 2D games in Lua."
LICENSE = "Zlib"

PV = "0.7.2"

RPM_NAME = "love-0_7_2-0.7.2-3.18.aarch64.rpm"
RPM_HASH = "9c77592d62a1778210856b631a7daff78d341251c1bbbb4619c21f77d6151a161d3a78813dacde31a36c2ae982c65b1bd586b5708a23a0a1c08b8845ea1f1c40"

RPROVIDES:${PN} += "love-0-7-2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libIL.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
liblua5.1.so.5 \
libm.so.6 \
libmodplug.so.1 \
libmpg123.so.0 \
libopenal.so.1 \
libphysfs.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
