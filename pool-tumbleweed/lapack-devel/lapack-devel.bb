SUMMARY = "Linear Algebra Package"
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

RPM_NAME = "lapack-devel-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "0f5049db4be4641ea084583ae5388d1b14b110659482d9c0b31dfdf8dbc3ee48a5f5a1547c4d6bfde046130b357b95c22606f52931a7a6d966aea6267bbc5125"

RPROVIDES:${PN} += "lapack \
lapack-devel"

RDEPENDS:${PN} += "blas-devel \
liblapack3"

inherit rpm
