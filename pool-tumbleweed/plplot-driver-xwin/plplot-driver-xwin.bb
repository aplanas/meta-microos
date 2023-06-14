SUMMARY = "PLplot driver using the xwin backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the xwin driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-xwin-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "36a3fec46054b7c2b6c3cb3d3425a3d1094884f43332dca64b638cecdbedd05d354ae9b57eb4e3011335cc30aa51f9b870ca404660004cac5aa0f3383d28b445"

RPROVIDES:${PN} += "plplot-driver-xwin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
