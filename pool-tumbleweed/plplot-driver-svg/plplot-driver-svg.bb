SUMMARY = "PLplot driver using the SVG backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the SVG driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-svg-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "d7481d1b620d5f7d6d965e7a7bb03c499b1a621060fb40a2715dc2d2de20f33886d3b281629dbcbad82789f2c3fee2ebe29a2a4d173a9374799b1d7b27aa16ac"

RPROVIDES:${PN} += "plplot-driver-svg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
