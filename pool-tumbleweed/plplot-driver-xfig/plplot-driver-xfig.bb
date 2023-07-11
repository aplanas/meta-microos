SUMMARY = "PLplot driver using the xfig backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the xfig driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-xfig-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "1d822e8b7e9079b7933e80bbd6701e847a43e8828c4f1bf712dcf716069e6fc0df352d89ef7f3361e2380f03ccb489d44d6eeab3267f842879e74eef4f606248"

RPROVIDES:${PN} += "plplot-driver-xfig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
