SUMMARY = "Mesa vulkan driver for Freedreno"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libvulkan_freedreno-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "5360c530112f12ed845d6b8a7ba14ec1274a320be2bead8b403d8fa60e29aa1227f6994d95f1b5d509455b51310f42b72396159a1ec1a9c1953da0ea13a22cbe"

RPROVIDES:${PN} += "libvulkan-freedreno \
libvulkan-freedreno.so"

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
