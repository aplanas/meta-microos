SUMMARY = "PLplot driver using the cairo backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the cairo driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-cairo-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "5739c0f4b7fd0f208b070d443e1d57e53422c74324906749107031bee83ebd4b377a70976192febdfa843a12608d4d2a6ad7c3ee008c0cd61351f0898de5d910"

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
