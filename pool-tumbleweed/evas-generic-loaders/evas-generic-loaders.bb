SUMMARY = "Set of generic loaders for Evas"
DESCRIPTION = "Set of generic loaders allowing to open XCF, PDF, PS, RAW, \
MPG/AVI/OGV/MOV/MKV/WMV. \
 \
Useful only for evas library. \
 \
This part of the Enlightenment Foundation Libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "evas-generic-loaders-1.26.3-30.8.aarch64.rpm"
RPM_HASH = "ffe9899ee3fdb55db3db1a8c03e4c4a49fb3bff04cd2940b83204127841e6cd8117354aad95096d7355795f5d93c57ae61c534e416083fca3b37c3f67ac241f4"

RPROVIDES:${PN} += "evas-generic-loaders"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libeina.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpoppler-cpp.so.0 \
libraw.so.23 \
librsvg-2.so.2 \
libspectre.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
