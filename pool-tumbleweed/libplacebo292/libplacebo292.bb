SUMMARY = "Library for GPU-accelerated video/image rendering primitives"
DESCRIPTION = "This library contains GPU-accelerated video/image rendering \
primitives, as well as a standalone vulkan-based image/video \
renderer. It is based on the core rendering algorithms and ideas \
of mpv."
LICENSE = "LGPL-2.1-or-later"

PV = "6.292.1"

RPM_NAME = "libplacebo292-6.292.1-1.1.aarch64.rpm"
RPM_HASH = "71f24cb8e118fe63e42b6362b3b2176900efc1806054d48dd77932ef6a55591d6ff62533a7601ac9bdc231ecefb5951ee6517df47e078130117c26caef644eef"

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
