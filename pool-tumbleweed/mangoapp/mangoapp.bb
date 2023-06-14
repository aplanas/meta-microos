SUMMARY = "A transparent background application with a built-in MangoHud for gamescope"
DESCRIPTION = "A transparent background OpenGL application with a built-in MangoHud designed to be run inside a gamescope instance."
LICENSE = "MIT"

PV = "0.6.9~1"

RPM_NAME = "mangoapp-0.6.9~1-1.1.aarch64.rpm"
RPM_HASH = "9f85b1e28f079269efef0d988bd66dba9ea21682f57495fbf3c969b284f84f993f702022f2ef416e20d13b7f1a39ed0a401a86d75ee4b2b86c946909d40f92d9"

RPROVIDES:${PN} += "mangoapp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libX11.so.6 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
libspdlog.so.1.11 \
libstdc++.so.6 \
mangohud"

inherit rpm
