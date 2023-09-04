SUMMARY = "Development headers and documentation for the Armadillo C++ library"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package contains files necessary for development using the \
Armadillo C++ library. It contains header files, example programs, \
and user documentation (reference guide)."
LICENSE = "Apache-2.0"

PV = "12.6.1"

RPM_NAME = "armadillo-devel-12.6.1-1.1.aarch64.rpm"
RPM_HASH = "506a83a79fc129c1d54c22049fe380cdd4b9d213969d597379e7fb69379593f822dc77fa252a01f8e0cb149224e87fad125dd8d44f2c9b92eef22349058ff0d7"

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
