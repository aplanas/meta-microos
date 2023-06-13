SUMMARY = "LAPACK Shared Library"
DESCRIPTION = "LAPACK provides routines for solving systems of simultaneous linear \
equations, least-squares solutions of linear systems of equations, \
eigenvalue problems, and singular value problems. The associated matrix \
factorizations (LU, Cholesky, QR, SVD, Schur, generalized Schur) are \
also provided, as are related computations such as reordering of the \
Schur factorizations and estimating condition numbers. Dense and banded \
matrices are handled, but not general sparse matrices. In all areas, \
similar functionality is provided for real and complex matrices, in \
both single and double precision."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "liblapack3-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "4eb49d6854746a03bfbe2b1a4900a2b4aae005b378f0536ec872930c06a91039dd428b19b48ef8b4306f0f13617484494d1f41983089d6a93554ea316234aa0b"

RPROVIDES:${PN} += "liblapack.so.3()(64bit) \
liblapack3 \
liblapack3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
update-alternatives"

inherit rpm
