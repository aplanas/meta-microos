SUMMARY = "C library for reading, creating, and modifying zip archives"
DESCRIPTION = "libzip is a C library for reading, creating, and modifying zip \
archives. This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "libzip-devel-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "4cb936f3519f91a815b1c71d8048a4b359d4de58c50feb0f9065b1065f06179896befbb4ab2ce3007ae2d5ef669b3972eb969c3dbbcf29c1fd733c2be1fd1def"

RPROVIDES:${PN} += "cmake-libzip \
libzip-devel \
pkgconfig-libzip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libzip5"

inherit rpm
