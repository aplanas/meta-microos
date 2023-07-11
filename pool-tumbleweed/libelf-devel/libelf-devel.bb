SUMMARY = "Development files for libelf"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libelf."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf-devel-0.189-3.3.aarch64.rpm"
RPM_HASH = "b2e42b24bb8f11833c63925503346c842d5b42708ea68a41a2926688060899fb3a7873e7a22faa1de1c9620f09e74dab8b871ea3c4265f1de83b239e5cf30aff"

RPROVIDES:${PN} += "libelf-devel \
pkgconfig-libelf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libelf1 \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
