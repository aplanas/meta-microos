SUMMARY = "Development files for libplacebo"
DESCRIPTION = "The libplacebo-devel package contains libraries and header files for \
developing applications that use libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "libplacebo-devel-5.264.1-1.2.aarch64.rpm"
RPM_HASH = "29a366e3ff7d46cea6c6671c72dc9b055608a8d2966c0a219d24d5b2c6002d4b8953382f5a9f71513efaf99eabf1d6444138dd4fb3282b381f9ca3d8a37fad57"

RPROVIDES:${PN} += "libplacebo-devel \
libplacebo-devel(aarch-64) \
pkgconfig(libplacebo)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplacebo264 \
pkgconfig(dovi) \
pkgconfig(lcms2) \
pkgconfig(libunwind) \
pkgconfig(shaderc) \
pkgconfig(vulkan)"

inherit rpm
