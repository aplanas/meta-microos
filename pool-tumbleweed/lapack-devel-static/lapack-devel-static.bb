SUMMARY = "Linear Algebra Package - static libraries"
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

RPM_NAME = "lapack-devel-static-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "767e57647f262da3f80e3f60ea25c32fa5e6a9a82f5d769d10fc9705b2a91b8ae82d50bf1727e9720fdb440f89fc15ba72e3f38221e99da61a83cb13e9fdd624"

RPROVIDES:${PN} += "lapack-devel-static \
lapack-devel-static(aarch-64)"
RDEPENDS:${PN} += "lapack-devel"

inherit rpm
