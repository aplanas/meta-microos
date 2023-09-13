SUMMARY = "Mesa vulkan driver for LVP"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libvulkan_lvp-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "c784cc405e5ab25a9aca0a3ab2a11b4cb3d21633fa196b0cc4755569bef6f45b86674ff41b8a963a0a01a9f10e4c8e3c0a028c76b04744f73a7bc172f70600c1"

RPROVIDES:${PN} += "libvulkan-lvp \
libvulkan-lvp.so"

RDEPENDS:${PN} += "Mesa-vulkan-device-select \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libX11-xcb.so.1 \
libc.so.6 \
libdrm.so.2 \
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
