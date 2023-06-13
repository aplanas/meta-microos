SUMMARY = "Library for GPU-accelerated video/image rendering primitives"
DESCRIPTION = "This library contains GPU-accelerated video/image rendering \
primitives, as well as a standalone vulkan-based image/video \
renderer. It is based on the core rendering algorithms and ideas \
of mpv."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "libplacebo264-5.264.1-1.2.aarch64.rpm"
RPM_HASH = "73c9fa058c1db3ab5414387a0f535468c74cb0a339c264dca2e87b65b08bc64b7fe3e3c5af23202fd915ee8b7c424c35f001703ef4d6019c74b4b52a32e445e1"

RPROVIDES:${PN} += "libplacebo.so.264()(64bit) \
libplacebo264 \
libplacebo264(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdovi.so.3()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libshaderc_shared.so.1()(64bit) \
libunwind.so.8()(64bit) \
libvulkan.so.1()(64bit)"

inherit rpm
