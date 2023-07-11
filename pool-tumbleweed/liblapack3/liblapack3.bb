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

RPM_NAME = "liblapack3-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "bc38a698ee4bfc9dafcaa8f89e0576549b8e1eb90b3381fc694b7de3699cc835839c5dda37e02d99f9914539e2f93d9dc230a83c1c23b8a6672426d69fc1bdbc"

RPROVIDES:${PN} += "liblapack.so.3 \
liblapack3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
update-alternatives"

inherit rpm
