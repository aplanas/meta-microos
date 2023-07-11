SUMMARY = "Demo for bare metal graphics"
DESCRIPTION = "kmscube is a little demonstration program for how to drive bare metal graphics \
without a compositor like X11, wayland or similar, using DRM/KMS (kernel mode \
setting), GBM (graphics buffer manager) and EGL for rendering content using \
OpenGL or OpenGL ES."
LICENSE = "MIT"

PV = "0.0.0.git1612698153.9f63f35"

RPM_NAME = "kmscube-0.0.0.git1612698153.9f63f35-1.8.aarch64.rpm"
RPM_HASH = "2bd63f4242252a2bd14015162a4520b359814f3b0faeb5f6d91e913686d292995e45bf54fbd8e7351a0bb43bfea4f25016167f31bfbd79b07d9fafef0c74e97b"

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
