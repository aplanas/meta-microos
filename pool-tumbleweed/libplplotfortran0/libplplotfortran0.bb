SUMMARY = "Shared libraries for PLplot's Fortran bindings"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared libraries necessary for using PLplot \
with Fortran."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplotfortran0-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "f26ceb00db5e1cc49398af0701f5fe59fa7cdd36793ab3273a726c6fe7bd5dbf7bfed1685267f4e0269479370d2a44054a20300bc4a62bcd38a5b9dec88b0989"

RPROVIDES:${PN} += "libplplotfortran.so.0 \
libplplotfortran0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libplplot.so.17"

inherit rpm
