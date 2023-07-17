SUMMARY = "A Vulkan and OpenGL overlay for monitoring"
DESCRIPTION = "A Vulkan and OpenGL overlay for monitoring FPS, temperatures, CPU/GPU load and more."
LICENSE = "MIT"

PV = "0.6.9~1"

RPM_NAME = "mangohud-0.6.9~1-1.3.aarch64.rpm"
RPM_HASH = "5b3793cb14eef25c001a8e0409020dfe29a42a00268aa25d1fab22929baf61484857bf2bb1582de06e35c1f70c5c268a1a8e5b80b6dd5e773c61d0c9f3c6b368"

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
libspdlog.so.1.12 \
libstdc++.so.6"

inherit rpm
