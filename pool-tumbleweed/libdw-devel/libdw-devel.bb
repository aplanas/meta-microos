SUMMARY = "Development files for libdw"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libdw."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw-devel-0.189-3.3.aarch64.rpm"
RPM_HASH = "a73fd664b1d3cb8aca0e0cbd3c481856f9e9dddc35490fbe4ffd250666103474311b6d27adcb6baeef5e172121bec157e0288688e7e5788676b0f920499919af"

RPROVIDES:${PN} += "libdw-devel \
pkgconfig-libdw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdw1 \
libelf-devel \
pkgconfig-libelf \
pkgconfig-liblzma \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
