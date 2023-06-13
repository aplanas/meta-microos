SUMMARY = "A Vulkan and OpenGL overlay for monitoring"
DESCRIPTION = "A Vulkan and OpenGL overlay for monitoring FPS, temperatures, CPU/GPU load and more."
LICENSE = "MIT"

PV = "0.6.9~1"

RPM_NAME = "mangohud-0.6.9~1-1.1.aarch64.rpm"
RPM_HASH = "060181f05cba5d823b30316c1e1227d07b6524a13f06d8000dad0f8bb94434c5d9fee97b03a486fcc8e190a65e16e0f223134b0e775f479c0911ca970d018219"

RPROVIDES:${PN} += "bundled(ImGui) \
bundled(Vulkan-Headers-sdk) \
libMangoApp.so()(64bit) \
libMangoHud.so()(64bit) \
libMangoHud_dlsym.so()(64bit) \
mangohud \
mangohud(aarch-64) \
metainfo() \
metainfo(io.github.flightlessmango.mangohud.metainfo.xml)"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libspdlog.so.1.11()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
