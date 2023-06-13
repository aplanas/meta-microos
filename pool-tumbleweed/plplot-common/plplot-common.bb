SUMMARY = "Files for development with PLplot"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
PLplot can be used from within compiled languages such as C, C++, \
FORTRAN and Java, and interactively from interpreted languages such as \
Octave, Python, Perl and Tcl. \
 \
This package provides some common files shared between the different \
PLplot interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-common-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "bdd7001f3f2c7c3e250782cba8baa836e9065945db29068f17ac2140b31c6aa5b7a70385fe040440cf69b049c278a75cd570d04c465404cffc47ec510fe4d3ef"

RPROVIDES:${PN} += "plplot \
plplot-common \
plplot-common(aarch-64)"

RDEPENDS:${PN} += "libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libplplot.so.17()(64bit)"

inherit rpm
