SUMMARY = "Mesa vulkan driver for AMD GPU"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvulkan_radeon-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "ddf6e3b0397f96e09dfa41ebd1edba7c7f2f3d0d17375b9050b5e2cdb21ec5f51f8a505af6c1daf5390b7558c4d0f9015ed262bdbca86cc8631695dc651aa842"

RPROVIDES:${PN} += "libvulkan_radeon \
libvulkan_radeon(aarch-64) \
libvulkan_radeon.so()(64bit)"

RDEPENDS:${PN} += "Mesa-vulkan-device-select \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libX11-xcb.so.1()(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libdrm_amdgpu.so.1()(64bit) \
libelf.so.1()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-dri3.so.0()(64bit) \
libxcb-present.so.0()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb-sync.so.1()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxshmfence.so.1()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
