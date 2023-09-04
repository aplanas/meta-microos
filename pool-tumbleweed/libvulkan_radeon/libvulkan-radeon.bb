SUMMARY = "Mesa vulkan driver for AMD GPU"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libvulkan_radeon-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "2b88472b8ea1fe0ce2d1c61d77da699d6a0630c135164ab27dcd184c1da9688a0dec8e01c082cd3210ece7bc66285f2f6517fe56a155928db95e397fbebca224"

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
