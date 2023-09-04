SUMMARY = "Mesa vulkan driver for LVP"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libvulkan_lvp-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "9637250e61b6bfbf59475970627d7f3e855ada39425b26b2595721404048acc96a7113bb7d121188ed5a3e3bab3bea971d2371ff5b7ad0653782987f85ede91d"

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
