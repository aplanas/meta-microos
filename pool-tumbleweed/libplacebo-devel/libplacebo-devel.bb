SUMMARY = "Development files for libplacebo"
DESCRIPTION = "The libplacebo-devel package contains libraries and header files for \
developing applications that use libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "libplacebo-devel-5.264.1-1.3.aarch64.rpm"
RPM_HASH = "21b6b4950e815b9c043c8cda1443f4364e64b5ab12ab65127b23340ad7d6a881a5a64d75e957bd28f7203f2d73532c2bd5bdb60fb32fd903d04ddb44a575f74f"

RPROVIDES:${PN} += "libplacebo-devel \
pkgconfig-libplacebo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplacebo264 \
pkgconfig-dovi \
pkgconfig-lcms2 \
pkgconfig-libunwind \
pkgconfig-shaderc \
pkgconfig-vulkan"

inherit rpm
