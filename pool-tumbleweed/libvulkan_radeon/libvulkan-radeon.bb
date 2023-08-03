SUMMARY = "Mesa vulkan driver for AMD GPU"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libvulkan_radeon-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "0b744eca6cc3ed3221fa64286991219be006ea2d551acd0ec52d31b0247272303493fa670de46e12f5b5918e35cfb5b27fdb1024fe38c58854d49516cf4a3ce8"

RPROVIDES:${PN} += "libvulkan-radeon \
libvulkan-radeon.so"

RDEPENDS:${PN} += "Mesa-vulkan-device-select \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libX11-xcb.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxshmfence.so.1 \
libz.so.1"

inherit rpm
