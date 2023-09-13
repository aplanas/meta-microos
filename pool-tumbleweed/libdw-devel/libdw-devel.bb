SUMMARY = "Development files for libdw"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libdw."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw-devel-0.189-5.1.aarch64.rpm"
RPM_HASH = "60acd97c138126dae3ddca6a78f409e3a3201e481353229cbcd925e13329cc8d422fd3fa1a4dff7b6eb320d8c966814d595e512d189647eb38719ee99dce46c1"

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
