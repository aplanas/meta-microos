SUMMARY = "Development headers and documentation for the Armadillo C++ library"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package contains files necessary for development using the \
Armadillo C++ library. It contains header files, example programs, \
and user documentation (reference guide)."
LICENSE = "Apache-2.0"

PV = "12.6.2"

RPM_NAME = "armadillo-devel-12.6.2-1.1.aarch64.rpm"
RPM_HASH = "062d98bc127d1517652d7ff2d8f42378553b2397336b7f72cd05b5027e94854a72ccf78676d48d6af6f1f3763293fa3b15a18687eb795509714fac83b1386768"

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
