SUMMARY = "PLplot functions for scientific plotting with Tcl/Tk"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with Tcl/Tk."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-tcltk-libs-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "e8b6a0d0277472acf00ef169f9f97a6f55378d55250da235b4a66bb3da94728e018252db7b879e9735b82b9513d7b270cc27487c0fa00abc0324edd980e88dea"

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
