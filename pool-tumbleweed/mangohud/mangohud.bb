SUMMARY = "A Vulkan and OpenGL overlay for monitoring"
DESCRIPTION = "A Vulkan and OpenGL overlay for monitoring FPS, temperatures, CPU/GPU load and more."
LICENSE = "MIT"

PV = "0.6.9~1"

RPM_NAME = "mangohud-0.6.9~1-1.2.aarch64.rpm"
RPM_HASH = "2cef8db64e8df553c0edb9294cfce3ace24509855e78969a0e613dc6a5df6376ad0ea5a849d9ea24eab6003dc6a80bcf92b35a7c92c75c3c35deb5b5c4633328"

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
