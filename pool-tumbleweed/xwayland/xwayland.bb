SUMMARY = "Xwayland Xserver"
DESCRIPTION = "This package contains the Xserver running on the Wayland Display Server."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "xwayland-23.1.2-1.1.aarch64.rpm"
RPM_HASH = "43476efc35ffc747f86e3bbe90ee16eab7c8f121d382aea5c8f069df1a3a345984849de8f80eaed49bddaff2a277c4027122c894a9c587882eff99d8c89eb89e"

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
