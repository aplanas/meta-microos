SUMMARY = "A transparent background application with a built-in MangoHud for gamescope"
DESCRIPTION = "A transparent background OpenGL application with a built-in MangoHud designed to be run inside a gamescope instance."
LICENSE = "MIT"

PV = "0.6.9~1"

RPM_NAME = "mangoapp-0.6.9~1-1.2.aarch64.rpm"
RPM_HASH = "c2944d4bdb903bbc72c980b9b06aec8c85e4aba9235c0f6d68b163a36808800af5d7d4fcbe02fc466764d8f9f9ddc928598503798a5b0d592cf459a189ce2094"

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
