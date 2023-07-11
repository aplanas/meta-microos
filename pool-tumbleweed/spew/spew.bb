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

RPM_NAME = "spew-1.0.8-5.11.aarch64.rpm"
RPM_HASH = "710f5008e3ddfdab279dad18d78b39dd998eed5bc4911c39fb16b5e28855d99867c4e4d33ce8c663bf201b9ce46970b2bcc6850554acbe02a3d3b7d9b8c979a4"

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
