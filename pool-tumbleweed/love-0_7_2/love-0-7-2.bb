SUMMARY = "2D gaming engine written in Lua"
DESCRIPTION = "LÖVE is a framework for making 2D games in Lua."
LICENSE = "Zlib"

PV = "0.7.2"

RPM_NAME = "love-0_7_2-0.7.2-3.19.aarch64.rpm"
RPM_HASH = "fc44c4971ac3b030da2fc5e0b4f1d3e2922c6ac4cbd4dd8a8e3a587f47da1e85ae725aa66ec2811f3b98da99e6dcc1abda0d86bcd548df0f3ab268b4a9f07b5c"

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
