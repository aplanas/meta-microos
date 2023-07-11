SUMMARY = "Development files for Linux-native io_uring I/O access library"
DESCRIPTION = "This package provides header files to include and libraries to link with \
for the Linux-native io_uring."
LICENSE = "(GPL-2.0-only & LGPL-2.1-or-later) | MIT"

PV = "2.4"

RPM_NAME = "liburing-devel-2.4-1.1.aarch64.rpm"
RPM_HASH = "cae3260850d4b431550ccbff8e48601133a5c1b24ae03cd90fad5f75f428c20525c501d903299b7c2c15725b4600c356c99d929ebbaf47f572eb0254d568eef8"

RPROVIDES:${PN} += "liburing-devel \
liburing2-devel \
pkgconfig-liburing \
pkgconfig-liburing-ffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liburing2 \
pkgconfig"

inherit rpm
