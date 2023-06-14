SUMMARY = "Mesa vulkan driver for AMD GPU"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvulkan_radeon-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "ddf6e3b0397f96e09dfa41ebd1edba7c7f2f3d0d17375b9050b5e2cdb21ec5f51f8a505af6c1daf5390b7558c4d0f9015ed262bdbca86cc8631695dc651aa842"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
