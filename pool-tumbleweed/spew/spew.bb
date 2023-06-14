SUMMARY = "An I/O performance measurement and load generation tool"
DESCRIPTION = "Spew is used to measure I/O performance of character devices, block devices, \
and regular files. It can also be used to generate high I/O loads to stress \
systems while verifying data integrity. \
 \
Spew is easy to use and is flexible. No configuration files or complicated \
client/server configurations are needed. Spew also generates its own data \
patterns that are designed to make it easy to find and debug data integrity \
problems."
LICENSE = "GPL-2.0-only"

PV = "1.0.8"

RPM_NAME = "spew-1.0.8-5.10.aarch64.rpm"
RPM_HASH = "e9a7949d07461c7584a964858edbc62cd3aa24dfcfa126b04c56bd68d905f083e815012d8d77b6bbf305c0d9a9c7ab46cea780b9489cd0e29412d7f687b1cb56"

RPROVIDES:${PN} += "config-spew \
spew"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpopt.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
