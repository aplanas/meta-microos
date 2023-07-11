SUMMARY = "Development headers and documentation for the Armadillo C++ library"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package contains files necessary for development using the \
Armadillo C++ library. It contains header files, example programs, \
and user documentation (reference guide)."
LICENSE = "Apache-2.0"

PV = "12.4.1"

RPM_NAME = "armadillo-devel-12.4.1-1.1.aarch64.rpm"
RPM_HASH = "7070791116892981052565a5e1c706d1e1f46f8d670f836ce086a98824d22e286264fd83f8ede7ab519605379e12dd16ff346916092bc2f3f45b1c4e932eb1eb"

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
