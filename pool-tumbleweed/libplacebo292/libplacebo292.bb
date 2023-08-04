SUMMARY = "Library for GPU-accelerated video/image rendering primitives"
DESCRIPTION = "This library contains GPU-accelerated video/image rendering \
primitives, as well as a standalone vulkan-based image/video \
renderer. It is based on the core rendering algorithms and ideas \
of mpv."
LICENSE = "LGPL-2.1-or-later"

PV = "6.292.0"

RPM_NAME = "libplacebo292-6.292.0-1.1.aarch64.rpm"
RPM_HASH = "9477b6e8c4a9f6d7d7a5c3ab4a872840ddc27d005ebc43c3853f77a3e74cfbd0fb29eab1038faf463e8847a5e01f8c9a7e333b87d625c8d97f7e73b7701224e2"

RPROVIDES:${PN} += "libplacebo.so.292 \
libplacebo292"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdovi.so.3 \
liblcms2.so.2 \
libm.so.6 \
libshaderc-shared.so.1 \
libunwind.so.8 \
libvulkan.so.1"

inherit rpm
