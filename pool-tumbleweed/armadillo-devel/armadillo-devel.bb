SUMMARY = "Development headers and documentation for the Armadillo C++ library"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package contains files necessary for development using the \
Armadillo C++ library. It contains header files, example programs, \
and user documentation (reference guide)."
LICENSE = "Apache-2.0"

PV = "12.2.0"

RPM_NAME = "armadillo-devel-12.2.0-1.1.aarch64.rpm"
RPM_HASH = "b24ff9d78b40063846173f4c8b424df72e64e8a6192e0911e96b7abbca1a8c7eed93964f807e60d73c7e2f9465a09fe79929a397ae28fdd19908ed4ec3880cc6"

RPROVIDES:${PN} += "armadillo-devel \
armadillo-devel(aarch-64) \
pkgconfig(armadillo)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
arpack-ng-devel \
blas-devel \
lapack-devel \
libarmadillo12 \
libstdc++-devel \
superlu-devel"

inherit rpm
