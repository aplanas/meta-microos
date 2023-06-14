SUMMARY = "PLplot functions for scientific plotting with Tcl/Tk"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with Tcl/Tk."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-tcltk-libs-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "dc4cd6cc2a38be7e61bb27c12b178c29e75421109e960e86b2cb94dc102a513d33e969eb2fddb8e993ac0478db3d76772d5cb66d897e2399caf60a8a1bb7b23b"

RPROVIDES:${PN} += "libplplottcltk-Main.so.1 \
libplplottcltk.so.14 \
libtclmatrix.so.10 \
plplot-tcltk \
plplot-tcltk-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libplplot.so.17 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
