SUMMARY = "PLplot functions for scientific plotting with Tcl/Tk"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the development files for using PLplot with Tcl/Tk."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-tcltk-devel-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "2748fc4a1ea09f5c315e92d109cf9971b44ef8cc241d0cd9b5d3b28af8dba0c6f52dc806012cd9447774c1c068a1a6958aa13216e85900ed6e128e492ace06c7"

RPROVIDES:${PN} += "pkgconfig-plplot-tcl \
pkgconfig-plplot-tcl-Main \
plplot-tcltk-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
itcl-devel \
itk \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libplplot.so.17 \
libplplottcltk-Main.so.1 \
libplplottcltk.so.14 \
libpython3.10.so.1.0 \
libtcl8.6.so \
libtk8.6.so \
pkgconfig \
pkgconfig-plplot \
plplot-common \
plplot-tcltk-libs \
python-abi \
tcl-devel \
tk-devel"

inherit rpm
