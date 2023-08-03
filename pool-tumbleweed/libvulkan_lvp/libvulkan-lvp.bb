SUMMARY = "Mesa vulkan driver for LVP"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libvulkan_lvp-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "5ba5c176c5cfa14b9096613b80834db56ac28a810d4b7be0341ed2f7ab4cf708b95d5446f401d82b27406f6179c9f08f853f68f5ca1979e868453c649abd89bb"

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
