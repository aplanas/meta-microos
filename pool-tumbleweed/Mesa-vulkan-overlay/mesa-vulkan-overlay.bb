SUMMARY = "Mesa Vulkan Overlay layer"
DESCRIPTION = "This package contains the VK_MESA_Overlay Vulkan layer"
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-vulkan-overlay-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "d702c1cc1e994d87b6c520e712db9c0a49c3c37a7162e48f7bec82c82e11f5611dcff064b2a6beb477c531b1d714afa7f379be958cef946c245caa8ebb08ba4a"

RPROVIDES:${PN} += "Mesa-vulkan-overlay \
libVkLayer-MESA-overlay.so"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
