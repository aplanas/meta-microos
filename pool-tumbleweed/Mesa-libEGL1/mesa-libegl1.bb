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

PV = "23.1.7"

RPM_NAME = "Mesa-libEGL1-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "304d99495c1a487fcdde960dc3732da09e321b499ed9b07b1fb037a3998ff4bff55480ed2e1c9dd88431feb115c6b09708f9066ab62f12702da01ab74c13c3c3"

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
