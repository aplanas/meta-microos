SUMMARY = "An object oriented GL/GLES Abstraction/Utility Layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl20-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "7a3801531141f080321fe73b586c10ccf4a78f203117667859afd378cabb2b9ab1dc1a938f615f6b98e8290f7a0941cbcf5e7dad262747be31f5ca1c484894ec"

RPROVIDES:${PN} += "cogl \
libcogl-path.so.20 \
libcogl.so.20 \
libcogl20"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libgbm.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0"

inherit rpm
