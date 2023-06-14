SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-vulkan-overlay-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "3498d3511d6748e4895fe49a374747b4b4c3ef72feb79a49520acc5f6a8de584925603a933cf60c9fc5a34122dbc3ee06fb4d6e9aa0b518787bba7e5effdaee7"

RPROVIDES:${PN} += "Mesa-vulkan-overlay \
libVkLayer-MESA-overlay.so"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
