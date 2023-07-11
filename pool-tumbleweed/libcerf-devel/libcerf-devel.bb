SUMMARY = "Development headers and libraries for libcerf"
DESCRIPTION = "libcerf is a self-contained numeric library that provides an efficient and \
accurate implementation of complex error functions, along with Dawson, \
Faddeeva, and Voigt functions. \
 \
This package contains development headers and libraries for libcerf"
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "libcerf-devel-2.3-1.1.aarch64.rpm"
RPM_HASH = "4d02aa2c841e3a6cb77a503f9646032911e6fd34f98b876064c48bc57eae841d93dcb9a10ee7bc2fd3900e0d9deb3adae82101f61bd5c5124d326fc25657e4fe"

RPROVIDES:${PN} += "cmake-cerf \
libcerf-devel \
pkgconfig-libcerf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcerf2"

inherit rpm
