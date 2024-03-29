SUMMARY = "Mesa vulkan driver for AMD GPU"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libvulkan_radeon-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "f6412502ac93ed16a1eba89a6b7baa256f26e2da5df583f4c39637e67976d5bb0d802ac6a94dbed3d2718249ed3ffe9aca8f64b487090a137ce591db3d503f1a"

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
