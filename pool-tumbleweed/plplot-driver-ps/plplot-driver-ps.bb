SUMMARY = "PLplot driver using the ps backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the ps driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-ps-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "93aa99e0a7fd2310c58fcf06d595d29353ab20fb6836ebb96e83b13b4d030e57d669304488d47f4666c96da16c135c1ffd5ccd64b12322cbc6134f73c4f34f05"

RPROVIDES:${PN} += "plplot-driver-ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
