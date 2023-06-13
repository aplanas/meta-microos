SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgromacs_mpi8-2023-1.1.aarch64.rpm"
RPM_HASH = "d80239b7609119a6e55d855087ae0e8403d6a838d537a8a19a4b5238aebb85605cb90f1ba5e99912cb97e5fb9e74f6c16eca7477f3c83a51a687f97a27d1fc46"

RPROVIDES:${PN} += "libgromacs_mpi.so.8()(64bit) \
libgromacs_mpi8 \
libgromacs_mpi8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libmuparser.so.2.3.4()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
