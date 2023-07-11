SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi2-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "23eb2c755761017b30cd4ae831038feed624fd2d9c28d03de629d9878951d30856d7f78c068b0ec777bb93bc66b6f7884cc600cd4c7c8b38a11b3ebdd02ca0f0"

RPROVIDES:${PN} += "libparpack.so.2 \
libparpack2-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarpack.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi-mpifh.so.20 \
libopenblas.so.0 \
openmpi2-libs"

inherit rpm
