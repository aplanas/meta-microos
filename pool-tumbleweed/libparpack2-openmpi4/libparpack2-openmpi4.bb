SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi4-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "3d1a08104b8fb1451f1677847dc694b3749c271e5d1ca422c3bc028d803a5188a12c340cccb1e1768084fe648d437d12e16ac00e795a4e1c5e0afd9a2747fb30"

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
