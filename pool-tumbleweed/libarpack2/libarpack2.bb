SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libarpack2-3.9.0-1.5.aarch64.rpm"
RPM_HASH = "2e8b525c6911858550723d765ca0081731d04d2679b27793bc90fc38d2d1950370e0a2d50d0fe8cb51134be65e95a003402505225e2122ae59fe7c65326479d2"

RPROVIDES:${PN} += "libarpack.so.2 \
libarpack2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0"

inherit rpm
