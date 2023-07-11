SUMMARY = "Development package for Network Support Library (NIS)"
DESCRIPTION = "The Network Support Library for NIS was formerly part of glibc and \
is now a standalone library. The big difference is, that this library \
has support for IPv6. \
This package contains all files to develop and link against libnsl."
LICENSE = "LGPL-2.1-only"

PV = "2.0.0"

RPM_NAME = "libnsl-devel-2.0.0-1.14.aarch64.rpm"
RPM_HASH = "96a853d7dcb66b5da6f6c11a9ba67dddc41d0c423b6afbe6c278b89703f7a6bf594a4eb85d3049c00fb09a8870162e379ad714a63f8c8bc317b4f004b81bf843"

RPROVIDES:${PN} += "libnsl-devel \
pkgconfig-libnsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnsl3 \
pkgconfig-libtirpc"

inherit rpm
