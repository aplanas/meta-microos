SUMMARY = "Basic Linear Algebra Subprograms"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra. BLAS provides a number of basic algorithms for \
linear algebra. BLAS is fast and well-tested, was written in FORTRAN 77 \
and built with gfortran. BLAS manual pages are available in the \
blas-man package."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "blas-devel-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "c1cd2e0099ef775ac679e3478bc93b0bac2f261c60b17089a7feb57ff484999b53eb618ea43c256237888442d53a99b67020cf02e63f85175ad220c976402fd3"

RPROVIDES:${PN} += "blas \
blas-devel"

RDEPENDS:${PN} += "libblas3"

inherit rpm
