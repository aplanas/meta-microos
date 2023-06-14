SUMMARY = "Mesa vulkan driver for Freedreno"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvulkan_freedreno-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "97dfa5160064b6edaf6e99f02b1fa0eb4b4056735a01eaa1a5c1e499c0d70079573df2e48a6d8cfaf0973331939fe4cd931b8a38d8709253085671194e843c05"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
