SUMMARY = "PLplot driver using the xwin backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the xwin driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-xwin-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "83b47edfbe6280954797c53006882e18e70a31d1c9eac5120ff35e2e75f9abecd96bae5479bca7695ef07f0effeea3347bcede9395ea695f885f7fa8dec7694e"

RPROVIDES:${PN} += "plplot-driver-xwin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
