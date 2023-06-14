SUMMARY = "Mesa vulkan driver for LVP"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvulkan_lvp-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "96800bcc83059269f30373c37caeb70059a72a1171751f3a5b46b251ae0affd575463d2a93239e00f52dfefae4ff7ab32b95410a524e776e123a9dae0b9cf281"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
