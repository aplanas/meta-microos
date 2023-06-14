SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi4-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "afbb9a58b743e300499c95142c7ca280cf29d6a7168df9d30149f126a750db26d9b7f53d5d0ea553a8470f0604a515c3de3fbe46eee95603fee39b96eefd7e37"

RPROVIDES:${PN} += "libparpack.so.2 \
libparpack2-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarpack.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi-mpifh.so.40 \
libopenblas.so.0 \
openmpi4-libs"

inherit rpm
