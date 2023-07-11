SUMMARY = "Files for development with PLplot"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
PLplot can be used from within compiled languages such as C, C++, \
FORTRAN and Java, and interactively from interpreted languages such as \
Octave, Python, Perl and Tcl. \
 \
This package provides the files necessary for development with PLplot \
in C."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-devel-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "bf8d367669ccc90b66b37491758269e2a1d13b671c90f82bf4b2f4d1f1ef4a09fbebf1e0831851bb26d274d13ab522ffd28e721b9d656706755749832cbcc728"

RPROVIDES:${PN} += "cmake-plplot \
pkgconfig-plplot \
plplot \
plplot-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
gcc-c++ \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcsirocsa0 \
libcsironn0 \
libplplot17 \
libqsastime0 \
pkgconfig \
pkgconfig-freetype2 \
plplot-common"

inherit rpm
