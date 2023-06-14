SUMMARY = "Demo for bare metal graphics"
DESCRIPTION = "kmscube is a little demonstration program for how to drive bare metal graphics \
without a compositor like X11, wayland or similar, using DRM/KMS (kernel mode \
setting), GBM (graphics buffer manager) and EGL for rendering content using \
OpenGL or OpenGL ES."
LICENSE = "MIT"

PV = "0.0.0.git1612698153.9f63f35"

RPM_NAME = "kmscube-0.0.0.git1612698153.9f63f35-1.7.aarch64.rpm"
RPM_HASH = "9e5353a30d24ec827c0d9522a1fa8719ce9182b942a6f72067018b16a996a274f0ea12a5396c1f4b3ff5a08392c0c8ecef05b6cc8ae492a727749c7614a158a6"

RPROVIDES:${PN} += "kmscube"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libpng16.so.16"

inherit rpm
