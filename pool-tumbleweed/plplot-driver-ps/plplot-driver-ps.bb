SUMMARY = "PLplot driver using the ps backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the ps driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-ps-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "4a46de40b8512db2d3ed159246e6d833ac645a653843450cc40f3f7b4a67667ee176f50f8a3c6ba38f7a4f220047cb9b5d2b5dcd8c8637ce85643e40d5765a65"

RPROVIDES:${PN} += "plplot-driver-ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
