SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi1-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "eca472c0d63220ac9e4f9c8546bf2022a421d6ea303842dcf0aa3ed21cd69d6011e1415d40409c1cbd65251f169e351f298dc7d26e31b28cf05655215bbf785e"

RPROVIDES:${PN} += "libparpack.so.2 \
libparpack2-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarpack.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi-mpifh.so.12 \
libmpi-usempif08.so.11 \
libopenblas.so.0 \
openmpi1-libs"

inherit rpm
