SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-vulkan-overlay-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "c6dc4d8b3e20145551609295d603cd87df70e835cbb35712392c87f0a964ffa685ec377c34fe426fd427c46dad9952ed241dfa68068276bf221555e8186a5171"

RPROVIDES:${PN} += "Mesa-vulkan-overlay \
libVkLayer-MESA-overlay.so"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
