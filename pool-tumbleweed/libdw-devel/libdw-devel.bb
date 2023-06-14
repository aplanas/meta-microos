SUMMARY = "Development files for libdw"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libdw."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw-devel-0.189-3.1.aarch64.rpm"
RPM_HASH = "45a724d23e08d7c0d28737dfa9d033d081a56f16e95e80a4b431d04cc59194c664cdefb4558d11cc2ce59db63682d8f8df4f78c7b6604a3b334b71bd3172e26b"

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
