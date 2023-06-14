SUMMARY = "A InfiniMiner/Minecraft inspired game"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.7.0"

RPM_NAME = "minetest-5.7.0-1.1.aarch64.rpm"
RPM_HASH = "7755fe35afa60e4983382fe8d7fc1a08483ebf6330c2ca41171795315ceacc6ede27a7b4355de352fe8936707f88438faf10f9a1461e64dc6ae1007bd0c5a40c"

RPROVIDES:${PN} += "bundled-irrlicht \
minetest \
minetest-runtime"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libhiredis.so.1.1.0 \
libjpeg.so.8 \
libjsoncpp.so.25 \
libleveldb.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libncursesw.so.6 \
libopenal.so.1 \
libpng16.so.16 \
libpq.so.5 \
libspatialindex.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libvorbisfile.so.3 \
libz.so.1 \
libzstd.so.1 \
minetest-data \
opengl-games-utils"

inherit rpm
