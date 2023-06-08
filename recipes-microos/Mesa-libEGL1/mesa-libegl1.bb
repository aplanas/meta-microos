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

RPROVIDES:${PN} += "Mesa-libEGL1 Mesa-libEGL1(aarch-64) libEGL_mesa.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11-xcb.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libgbm.so.1()(64bit) libglapi.so.0()(64bit) libglvnd libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libwayland-client.so.0()(64bit) libwayland-server.so.0()(64bit) libxcb-dri2.so.0()(64bit) libxcb-dri3.so.0()(64bit) libxcb-present.so.0()(64bit) libxcb-randr.so.0()(64bit) libxcb-sync.so.1()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit) libxshmfence.so.1()(64bit)"

inherit rpm
