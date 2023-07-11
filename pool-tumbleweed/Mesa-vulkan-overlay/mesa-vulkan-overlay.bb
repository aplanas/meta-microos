SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-vulkan-overlay-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "c43fc3a7b426d688ac3010631fe7135cb0169eb0b406bc99f821742cadad6090b994885dbbfb01b69799092bc3ffb2ef25ee6eccc09f67889a5b403575f5cd92"

RPROVIDES:${PN} += "Mesa-vulkan-overlay \
libVkLayer-MESA-overlay.so"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
