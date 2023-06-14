SUMMARY = "Xwayland Xserver"
DESCRIPTION = "This package contains the Xserver running on the Wayland Display Server."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "xwayland-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "82e49f49d3f999a347283b27a5d367586b932cb8bdc00e00eb399bb959bdba73e16b2114fad556c8b47eba4b309feace496defe9e771fff6806e4c7d59d85f40"

RPROVIDES:${PN} += "xorg-x11-server-wayland \
xwayland"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libXau.so.6 \
libXdmcp.so.6 \
libXfont2.so.2 \
libbsd.so.0 \
libc.so.6 \
libcrypto.so.3 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libm.so.6 \
libpixman-1-0 \
libpixman-1.so.0 \
libtirpc.so.3 \
libwayland-client.so.0 \
libxcvt.so.0 \
libxshmfence.so.1 \
pkgconfig \
xkbcomp \
xkeyboard-config"

inherit rpm
