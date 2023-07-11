SUMMARY = "PLplot csironn component"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's csironn."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libcsironn0-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "d2366b04668d9bdb9ca7c6033850f56d201de96b56a6271ba05feb7ecbac38e280209b6314b67f191eb3d1000a9d4fd47c83830d0ed041c62e0348cccbc7475d"

RPROVIDES:${PN} += "libcsironn.so.0 \
libcsironn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libqhull-r.so.8.0"

inherit rpm
