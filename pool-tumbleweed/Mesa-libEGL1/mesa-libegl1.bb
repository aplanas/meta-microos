SUMMARY = "EGL API implementation"
DESCRIPTION = "This package contains the EGL native platform graphics interface \
library. EGL provides a platform-agnostic mechanism for creating \
rendering surfaces for use with other graphics libraries, such as \
OpenGL|ES and OpenVG. \
 \
This package contains modules to interface with the existing system \
GLX or DRI2 drivers to provide OpenGL via EGL. The Mesa main package \
provides drivers to provide hardware-accelerated OpenGL|ES and OpenVG \
support."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libEGL1-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "dec0d864cc7ec6ce8b506f866f2084c4ca3d68676ab27393fb0c5bc70f23d2ecac52626b5aadd5d848449d2e245d189e7a82df4b5843253f4b1909b49d03e865"

RPROVIDES:${PN} += "Mesa-libEGL1 \
libEGL-mesa.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libglapi.so.0 \
libglvnd \
libm.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb-dri2.so.0 \
libxcb-dri3.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxshmfence.so.1"

inherit rpm
