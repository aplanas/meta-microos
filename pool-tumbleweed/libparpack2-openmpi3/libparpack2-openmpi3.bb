SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi3-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "53bdf55ec39b3358099524010caf653f3807c07264615271962e0320f455d430f9882aad95ecd2c5668d7214f8074aab00164b2be974472c07ed4624b5b869d1"

RPROVIDES:${PN} += "libparpack.so.2 \
libparpack2-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarpack.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi-mpifh.so.40 \
libopenblas.so.0 \
openmpi3-libs"

inherit rpm
