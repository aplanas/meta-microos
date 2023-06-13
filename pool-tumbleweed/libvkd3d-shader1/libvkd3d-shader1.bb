SUMMARY = "Direct3D 12 to Vulkan translation shader library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan shader library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "libvkd3d-shader1-1.7.1-1.2.aarch64.rpm"
RPM_HASH = "6f26037d0618bed1f14768905136e2486a18319aae028dcddb6ee5f5c9bf330fc9df6b5c5a38b073e09ac098011e91fc6c3904b182abc73559ffd34705dc502a"

RPROVIDES:${PN} += "libvkd3d-shader.so.1()(64bit) \
libvkd3d-shader.so.1(VKD3D_1_0)(64bit) \
libvkd3d-shader1 \
libvkd3d-shader1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSPIRV-Tools-shared-2023.3~rc1.so()(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
