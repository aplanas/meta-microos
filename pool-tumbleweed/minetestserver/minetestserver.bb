SUMMARY = "Minetest server"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like. \
 \
This package contains a minetest server."
LICENSE = "LGPL-2.1-or-later"

PV = "5.7.0"

RPM_NAME = "minetestserver-5.7.0-1.1.aarch64.rpm"
RPM_HASH = "d0f4a7e2100ec39ee39c491bf9ca007ea61bbb8103f7bd12f187f7c91bac1a376d5fbaef614e1c0bc31d5e92045d76d72a734d07ddc93a9fbfd2c4d8efd4b746"

RPROVIDES:${PN} += "config(minetestserver) \
minetest-runtime \
minetestserver \
minetestserver(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libhiredis.so.1.1.0()(64bit) \
libjsoncpp.so.25()(64bit) \
libleveldb.so.1()(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libpq.so.5()(64bit) \
libspatialindex.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
minetest-data \
shadow \
systemd"

inherit rpm
