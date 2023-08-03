SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-vulkan-overlay-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "3d1e9d357af8afac3fa9ed9ee5e5136d5172bf84ca163e00f951c90a497c98435d41af17a4c8d5e7e50c39c8f447881f2a4f6364af735cbe76e05cc06b6683f6"

RPROVIDES:${PN} += "Mesa-vulkan-overlay \
libVkLayer-MESA-overlay.so"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
