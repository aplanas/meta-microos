SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libparpack2-openmpi1-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "075471056599cd30d775421c52e4ee66d3fb2e3703d70b4de2fe11e218115ef2539bfed47b57da57c1e256f4cca6813b8434995af83de98212345c80fe4dbe3d"

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
