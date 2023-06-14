SUMMARY = "PLplot functions for scientific plotting with C"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's C binding."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplot17-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "3ec3f564e79aa377ceb5ca53326dd9fae29c75197d48e9b44918a428baefe4e0fbe31e2d2d642a2de3e9e4e14dcf1564c7d4b8d7ab93724b3603c5d62440f934"

RPROVIDES:${PN} += "libplplot.so.17 \
libplplot17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcsirocsa.so.0 \
libcsironn.so.0 \
libfreetype.so.6 \
libltdl.so.7 \
libm.so.6 \
libqsastime.so.0 \
libshp.so.2"

inherit rpm
