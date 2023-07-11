SUMMARY = "Basic Linear Algebra Subprograms"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra. BLAS provides a number of basic algorithms for \
linear algebra. BLAS is fast and well-tested, was written in FORTRAN 77 \
and built with gfortran. BLAS manual pages are available in the \
blas-man package."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "blas-devel-static-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "c11bdeaef351b68c81b05bbbe44b42c61a004fd98afe505e856f8084527c661bb4be6605fb9b1c8a299704e6a606c9054f497019fd41b7afd21ef6abc45679ef"

RPROVIDES:${PN} += "blas-devel-static"

RDEPENDS:${PN} += "blas-devel"

inherit rpm
