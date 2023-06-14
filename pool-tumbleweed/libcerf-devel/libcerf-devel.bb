SUMMARY = "Development headers and libraries for libcerf"
DESCRIPTION = "libcerf is a self-contained numeric library that provides an efficient and \
accurate implementation of complex error functions, along with Dawson, \
Faddeeva, and Voigt functions. \
 \
This package contains development headers and libraries for libcerf"
LICENSE = "MIT"

PV = "2.2"

RPM_NAME = "libcerf-devel-2.2-1.3.aarch64.rpm"
RPM_HASH = "6c09ee1ba76f7718cd1e8ce22bfbd2cc7f93e1ad27c1140c96c0abb0831757ee2143824c01b84bc74bf6945e782e34d97ea84d8e174b42b40fbe1c308e916f84"

RPROVIDES:${PN} += "cmake-cerf \
libcerf-devel \
pkgconfig-libcerf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcerf2"

inherit rpm
