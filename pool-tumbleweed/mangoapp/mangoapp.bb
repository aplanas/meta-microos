SUMMARY = "A transparent background application with a built-in MangoHud for gamescope"
DESCRIPTION = "A transparent background OpenGL application with a built-in MangoHud designed to be run inside a gamescope instance."
LICENSE = "MIT"

PV = "0.6.9~1"

RPM_NAME = "mangoapp-0.6.9~1-1.1.aarch64.rpm"
RPM_HASH = "9f85b1e28f079269efef0d988bd66dba9ea21682f57495fbf3c969b284f84f993f702022f2ef416e20d13b7f1a39ed0a401a86d75ee4b2b86c946909d40f92d9"

RPROVIDES:${PN} += "mangoapp \
mangoapp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libglfw.so.3()(64bit) \
libm.so.6()(64bit) \
libspdlog.so.1.11()(64bit) \
libstdc++.so.6()(64bit) \
mangohud"

inherit rpm
