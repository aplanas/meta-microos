SUMMARY = "Mesa vulkan driver for Freedreno"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libvulkan_freedreno-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "ca83c6fd9463693e37d30700dcb8847ceca2f895a63fd398251f245380872238b85b17eb512f7708124f091ce19f5cb09c7ed02c2a937e60dd85d7a620bf0713"

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
