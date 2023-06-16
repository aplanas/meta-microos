SUMMARY = "Set of generic loaders for Evas"
DESCRIPTION = "Set of generic loaders allowing to open XCF, PDF, PS, RAW, \
MPG/AVI/OGV/MOV/MKV/WMV. \
 \
Useful only for evas library. \
 \
This part of the Enlightenment Foundation Libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "evas-generic-loaders-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "dd04671da25e8c19494665c115e4c3354ba3c53fdb954f7448711593dec7657ba43fd628224e9ad98fcfadc8c16a0f895da8b6b1da1985f590b93fcc5ab573b7"

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
