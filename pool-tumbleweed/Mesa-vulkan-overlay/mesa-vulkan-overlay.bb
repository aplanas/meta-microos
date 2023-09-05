SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-vulkan-overlay-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "7c38dcea13360c394e92d65ae1787dfb6ec18e6866331b9e02b35a738a8d7ab5d00d1b63558bcf1c4c2c67c4b8316e1f5a1c5b75af31c62d4f2a6b5499b3f026"

RPROVIDES:${PN} += "Mesa-vulkan-overlay \
libVkLayer-MESA-overlay.so"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
