SUMMARY = "Development headers and documentation for the Armadillo C++ library"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package contains files necessary for development using the \
Armadillo C++ library. It contains header files, example programs, \
and user documentation (reference guide)."
LICENSE = "Apache-2.0"

PV = "12.6.0"

RPM_NAME = "armadillo-devel-12.6.0-1.1.aarch64.rpm"
RPM_HASH = "f079a1b0d0d708cb7c18b7aec8ad1f2c503a4df88a431d393ed0c00d99f7e4a2dc7b6dc492212fc1a680e998d0fd53ac313db90529923852a03d7c889ce8bd53"

RPROVIDES:${PN} += "armadillo-devel \
pkgconfig-armadillo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
arpack-ng-devel \
blas-devel \
lapack-devel \
libarmadillo12 \
libstdc++-devel \
superlu-devel"

inherit rpm
