SUMMARY = "A transparent background application with a built-in MangoHud for gamescope"
DESCRIPTION = "A transparent background OpenGL application with a built-in MangoHud designed to be run inside a gamescope instance."
LICENSE = "MIT"

PV = "0.6.9~1"

RPM_NAME = "mangoapp-0.6.9~1-1.3.aarch64.rpm"
RPM_HASH = "6b34c4b3fccd25f5e64c7ae9195775390a5890f781fd4f1926101db68a9189e700576d42a26c845e9adafd467b59e99fccb5cf8b1c95188552205c10c80c1eaf"

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
libspdlog.so.1.12 \
libstdc++.so.6 \
mangohud"

inherit rpm
