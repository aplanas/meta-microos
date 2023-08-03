SUMMARY = "Mesa vulkan driver for Freedreno"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libvulkan_freedreno-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "44309c0301880265e25ee0ac4e5843439510356a5a7d5f055516bb3fca73cdd256da61aed4402370c3b1bb589879fa0c2ece2247d2b41d16bdb38d6939f12202"

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
