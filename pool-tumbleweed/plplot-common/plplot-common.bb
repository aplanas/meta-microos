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

RPM_NAME = "plplot-common-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "1032eaa1520529be7ba913bcb673b7fdf3c6b45e0e18e8e4275bae9c4a97e935395fd1e565e400c11023c139dd17799cf8fa769a47e6ec7d12e889f9abe0b774"

RPROVIDES:${PN} += "plplot \
plplot-common"

RDEPENDS:${PN} += "libm.so.6 \
libplplot.so.17"

inherit rpm
