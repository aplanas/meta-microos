SUMMARY = "A InfiniMiner/Minecraft inspired game"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.7.0"

RPM_NAME = "minetest-5.7.0-1.1.aarch64.rpm"
RPM_HASH = "7755fe35afa60e4983382fe8d7fc1a08483ebf6330c2ca41171795315ceacc6ede27a7b4355de352fe8936707f88438faf10f9a1461e64dc6ae1007bd0c5a40c"

RPROVIDES:${PN} += "application() \
application(net.minetest.minetest.desktop) \
bundled(irrlicht) \
metainfo() \
metainfo(net.minetest.minetest.appdata.xml) \
minetest \
minetest(aarch-64) \
minetest-runtime"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libhiredis.so.1.1.0()(64bit) \
libjpeg.so.8()(64bit) \
libjsoncpp.so.25()(64bit) \
libleveldb.so.1()(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpq.so.5()(64bit) \
libspatialindex.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libvorbisfile.so.3()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
minetest-data \
opengl-games-utils"

inherit rpm
