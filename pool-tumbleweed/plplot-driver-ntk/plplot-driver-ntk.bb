SUMMARY = "PLplot driver using the ntk backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the ntk driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-ntk-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "17c8c28515ce1fa7eaa5c6057d121e158ff91076521a751f361281ed2c7feddafd3ccccec44819e00d1afcb388cd484b8a93e470aa892da8dbc39ad81c7f08b9"

RPROVIDES:${PN} += "plplot-driver-ntk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libplplot.so.17 \
libtcl8.6.so \
libtk8.6.so \
plplot-common"

inherit rpm
