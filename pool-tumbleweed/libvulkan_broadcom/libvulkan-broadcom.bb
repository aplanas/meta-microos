SUMMARY = "Mesa vulkan driver for Broadcom"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvulkan_broadcom-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "1839aaf05d5346b55b5c35d27aa9c5373eff868e777d7cd58bf2a5264ac4265154a2091c39c84e0ca7b19f0de5e167fd4c2758bcf202b4ab7b2651809d51b1dd"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
