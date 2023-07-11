SUMMARY = "Library for GPU-accelerated video/image rendering primitives"
DESCRIPTION = "This library contains GPU-accelerated video/image rendering \
primitives, as well as a standalone vulkan-based image/video \
renderer. It is based on the core rendering algorithms and ideas \
of mpv."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "libplacebo264-5.264.1-1.3.aarch64.rpm"
RPM_HASH = "9bfc0ebd8bdd8d7501f9e881aa4d040320a2c911e2dfd2566076b275004c3d97356322b51c65c9721c185476f1afad76702c795e940370f4ed87e75d50cdfabe"

RPROVIDES:${PN} += "libplacebo.so.264 \
libplacebo264"

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
