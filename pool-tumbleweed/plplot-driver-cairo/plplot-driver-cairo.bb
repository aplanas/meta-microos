SUMMARY = "PLplot driver using the cairo backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the cairo driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-cairo-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "63ab49ca33dddf2c2ca2ce74933d23a798c0aac2122a06558847207e7cfe7f867f275c35e07ce47a71e203e655e389cd3ec28f08d75012d30f35076ac12a1eae"

RPROVIDES:${PN} += "plplot-driver-cairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libplplot.so.17 \
plplot-common"

inherit rpm
