SUMMARY = "Mesa vulkan driver for Broadcom"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libvulkan_broadcom-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "7fb2583ec496c8fa38d123114987b09aca7a850b6416c03ac19ce99a54fceb684a3d3d97ad3e29c669006ab50d194659b6bb5d9d5f47c6d25a88911d5762b44a"

RPROVIDES:${PN} += "libvulkan-broadcom \
libvulkan-broadcom.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
