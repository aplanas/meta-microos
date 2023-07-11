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

RPM_NAME = "lapack-devel-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "ba0aba8633a875bdc25cff2b6a21ae5c162c38700c6301111669f7f4964a68f5fb60c626208f1fa948ffa0ac3392bc3441f376c9fc50d8b4a6560e6354b87939"

RPROVIDES:${PN} += "lapack \
lapack-devel"

RDEPENDS:${PN} += "blas-devel \
liblapack3"

inherit rpm
