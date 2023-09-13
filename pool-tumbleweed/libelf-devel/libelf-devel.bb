SUMMARY = "Development files for libelf"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libelf."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf-devel-0.189-5.1.aarch64.rpm"
RPM_HASH = "da13ad009aab4d08b44f8e70cd2232ec15ce596286f10dff730f873337a3e8089d34eedc104c2dc3e36501047ee1bcbeeda31abf61c3d083a6cf9ad44bf9b5e6"

RPROVIDES:${PN} += "libelf-devel \
pkgconfig-libelf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libelf1 \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
