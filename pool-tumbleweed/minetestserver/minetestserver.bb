SUMMARY = "Minetest server"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like. \
 \
This package contains a minetest server."
LICENSE = "LGPL-2.1-or-later"

PV = "5.7.0"

RPM_NAME = "minetestserver-5.7.0-1.2.aarch64.rpm"
RPM_HASH = "84931cb10aea7b01febf38924ad6dba8a31d24e11df0967abfe81a336fe2821bd81e888ed04e0edb2d691d660a6f172d23e358d590687bbe0c666f3118ca5516"

RPROVIDES:${PN} += "config-minetestserver \
minetest-runtime \
minetestserver"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libgmp.so.10 \
libhiredis.so.1.1.0 \
libjsoncpp.so.25 \
libleveldb.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libncursesw.so.6 \
libpq.so.5 \
libspatialindex.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1 \
minetest-data \
shadow \
systemd"

inherit rpm
