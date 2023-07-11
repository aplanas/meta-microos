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

RPM_NAME = "lapack-devel-static-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "fa03cff5852d6988b5bf1cc55cbc428de3972288cf4af0db825df319908bf7c2d55f29e3ecc26276079df7d2e1d448253e80dcde70c27f2e8d0af854e5ec9625"

RPROVIDES:${PN} += "lapack-devel-static"

RDEPENDS:${PN} += "lapack-devel"

inherit rpm
