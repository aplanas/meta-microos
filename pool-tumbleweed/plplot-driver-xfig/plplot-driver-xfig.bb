SUMMARY = "PLplot driver using the xfig backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the xfig driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-xfig-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "fa5047710fbf9605663395274ff1e3d5e4033095d5857544a598dcedb533b3802bae2d26e6a163e843f1a37582c654b22143a8bfe8fe1c1b893551761195a7d1"

RPROVIDES:${PN} += "plplot-driver-xfig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
