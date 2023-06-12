SUMMARY = "An object oriented GL/GLES Abstraction/Utility Layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl20-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "7a3801531141f080321fe73b586c10ccf4a78f203117667859afd378cabb2b9ab1dc1a938f615f6b98e8290f7a0941cbcf5e7dad262747be31f5ca1c484894ec"

RPROVIDES:${PN} += "cogl \
libcogl-path.so.20()(64bit) \
libcogl.so.20()(64bit) \
libcogl20 \
libcogl20(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libdrm.so.2()(64bit) \
libgbm.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libwayland-server.so.0()(64bit)"

inherit rpm
