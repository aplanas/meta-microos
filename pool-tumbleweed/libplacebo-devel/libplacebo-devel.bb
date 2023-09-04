SUMMARY = "Development files for libplacebo"
DESCRIPTION = "The libplacebo-devel package contains libraries and header files for \
developing applications that use libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "6.292.1"

RPM_NAME = "libplacebo-devel-6.292.1-1.1.aarch64.rpm"
RPM_HASH = "c0999218186082431af033285a0088bf849096ce25acb22c23ba3c51d2c0ea5e8d4eb554659e0b82543197c26f26bfef0d0c6edcac7a82b703ce4f6528f5a26a"

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
