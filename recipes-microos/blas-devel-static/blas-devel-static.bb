SUMMARY = "Basic Linear Algebra Subprograms"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra. BLAS provides a number of basic algorithms for \
linear algebra. BLAS is fast and well-tested, was written in FORTRAN 77 \
and built with gfortran. BLAS manual pages are available in the \
blas-man package."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "blas-devel-static-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "e97a7d4ebd13781775506172a46033f92d188820e90d59d84a00c68e124dd26ba61d13d7eb71d4e9d1416ed884a4a1383c797e83a01da543324de884910b155a"

RPROVIDES:${PN} += "blas-devel-static blas-devel-static(aarch-64)"
RDEPENDS:${PN} += "blas-devel"

inherit rpm
