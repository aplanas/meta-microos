SUMMARY = "Development files for libplacebo"
DESCRIPTION = "The libplacebo-devel package contains libraries and header files for \
developing applications that use libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "6.292.0"

RPM_NAME = "libplacebo-devel-6.292.0-1.1.aarch64.rpm"
RPM_HASH = "e38d4d0609271b182b5e7a421bdc3490d3df3e38c188a9c4c284b20394257f18fd89142bde356cb92c22d0275945b0a44d831d86b679c0e338f578e2d52a8498"

RPROVIDES:${PN} += "libplacebo-devel \
pkgconfig-libplacebo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplacebo292 \
pkgconfig-dovi \
pkgconfig-lcms2 \
pkgconfig-libunwind \
pkgconfig-shaderc \
pkgconfig-vulkan"

inherit rpm
