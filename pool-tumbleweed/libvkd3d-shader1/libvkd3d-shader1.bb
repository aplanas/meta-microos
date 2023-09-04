SUMMARY = "Direct3D 12 to Vulkan translation shader library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan shader library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libvkd3d-shader1-1.8-1.1.aarch64.rpm"
RPM_HASH = "8be699978c2226e9cbeff745742359e5faf9c8b6745c53b5be0a0b398d66b990920eaeb93b3b31f54e083a61926178be4b02e03671ecdd5852ab56948a9a1a65"

RPROVIDES:${PN} += "libvkd3d-shader.so.1 \
libvkd3d-shader1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-shared-2023.3~rc1.so \
libc.so.6"

inherit rpm
