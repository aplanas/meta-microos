SUMMARY = "Development files for libplacebo5"
DESCRIPTION = "The libplacebo-devel package contains libraries and header files for \
developing applications that use libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "libplacebo5-devel-5.264.1-1.1.aarch64.rpm"
RPM_HASH = "9dd4de66bf88a7a0afc05c90a6db6650e5b7317bdb7fb7888dd1e14cb14119617bb7db2e20b724938a1e0d4c67a890854119bea9ffbb42eb879094681465aac4"

RPROVIDES:${PN} += "libplacebo5-devel \
pkgconfig-libplacebo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplacebo264 \
pkgconfig-dovi \
pkgconfig-lcms2 \
pkgconfig-libunwind \
pkgconfig-shaderc \
pkgconfig-vulkan"

inherit rpm
