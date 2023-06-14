SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgromacs_mpi8-2023-1.1.aarch64.rpm"
RPM_HASH = "d80239b7609119a6e55d855087ae0e8403d6a838d537a8a19a4b5238aebb85605cb90f1ba5e99912cb97e5fb9e74f6c16eca7477f3c83a51a687f97a27d1fc46"

RPROVIDES:${PN} += "libgromacs-mpi.so.8 \
libgromacs-mpi8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.40 \
libmuparser.so.2.3.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
