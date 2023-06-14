SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi2-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "5c34dc15110d288090ee7e5e87599b7e04ed6120a8fdd93be1fdc4c4403c6bf85d6ebdf1fbff81e8a0e0cd9dca190f6db97f3e47da2bb2a7ac32060405cce306"

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
