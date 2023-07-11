SUMMARY = "PLplot functions for scientific plotting with Tcl/Tk"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the development files for using PLplot with Tcl/Tk."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-tcltk-devel-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "5730458dd341fed42fe33ee92e925b50fe723dc71330b5d719b7858dcb684e4a0af46fce355bab9c4d10739e7ea8d6dcb09d5ebe8c436433c4b10dbd23b3880d"

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
libpython3.11.so.1.0 \
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
