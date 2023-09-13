SUMMARY = "Mesa vulkan driver for Broadcom"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libvulkan_broadcom-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "7620a10f5634bc59b375e4baa9c631dc25d009ba46037c1f267badef29de477b49d6dfbfedf33e91b8d533cc26ccd5ec77cff657ad2be5cdc00c9f1cfee47853"

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
