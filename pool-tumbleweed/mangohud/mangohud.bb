SUMMARY = "A Vulkan and OpenGL overlay for monitoring"
DESCRIPTION = "A Vulkan and OpenGL overlay for monitoring FPS, temperatures, CPU/GPU load and more."
LICENSE = "MIT"

PV = "0.6.9~1"

RPM_NAME = "mangohud-0.6.9~1-1.1.aarch64.rpm"
RPM_HASH = "060181f05cba5d823b30316c1e1227d07b6524a13f06d8000dad0f8bb94434c5d9fee97b03a486fcc8e190a65e16e0f223134b0e775f479c0911ca970d018219"

RPROVIDES:${PN} += "bundled-ImGui \
bundled-Vulkan-Headers-sdk \
libMangoApp.so \
libMangoHud-dlsym.so \
libMangoHud.so \
mangohud"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libm.so.6 \
libspdlog.so.1.11 \
libstdc++.so.6"

inherit rpm
