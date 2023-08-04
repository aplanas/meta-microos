SUMMARY = "Library for GPU-accelerated video/image rendering primitives"
DESCRIPTION = "This library contains GPU-accelerated video/image rendering \
primitives, as well as a standalone vulkan-based image/video \
renderer. It is based on the core rendering algorithms and ideas \
of mpv."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "libplacebo264-5.264.1-1.1.aarch64.rpm"
RPM_HASH = "6153e508a0dec7366b7f99d0a05e89cd34608d62ec3c457dee9fa402b2b5dbbc1db40d61eb19cdc90a8f543ba03724240d5a952ef52dd27159913614aa5c7006"

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
