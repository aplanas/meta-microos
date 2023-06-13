SUMMARY = "2D gaming engine written in Lua"
DESCRIPTION = "LÖVE is a framework for making 2D games in Lua."
LICENSE = "Zlib"

PV = "0.7.2"

RPM_NAME = "love-0_7_2-0.7.2-3.18.aarch64.rpm"
RPM_HASH = "9c77592d62a1778210856b631a7daff78d341251c1bbbb4619c21f77d6151a161d3a78813dacde31a36c2ae982c65b1bd586b5708a23a0a1c08b8845ea1f1c40"

RPROVIDES:${PN} += "love-0_7_2 \
love-0_7_2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libIL.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.1.so.5()(64bit) \
libm.so.6()(64bit) \
libmodplug.so.1()(64bit) \
libmpg123.so.0()(64bit) \
libopenal.so.1()(64bit) \
libphysfs.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
