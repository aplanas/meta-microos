SUMMARY = "Basic Linear Algebra Subprograms"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra. BLAS provides a number of basic algorithms for \
linear algebra. BLAS is fast and well-tested, was written in FORTRAN 77 \
and built with gfortran. BLAS manual pages are available in the \
blas-man package."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "blas-devel-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "8161179feedd39d6220046d4ceefa12d35a6a102cdd15a7490a1ca3d7614ec89ef7480ca5e4b097892c743fad0d2128ae9a509b10f595400ef2fe90dffc2e61e"

RPROVIDES:${PN} += "blas \
blas-devel \
blas-devel(aarch-64)"
RDEPENDS:${PN} += "libblas3"

inherit rpm
