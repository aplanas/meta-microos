SUMMARY = "Xwayland Xserver"
DESCRIPTION = "This package contains the Xserver running on the Wayland Display Server."
LICENSE = "MIT"

PV = "23.2.0"

RPM_NAME = "xwayland-23.2.0-1.1.aarch64.rpm"
RPM_HASH = "246da14acda4b528e200257c75c198d653e62983f932f586ad5440bf3290ff878a32207982ffd26add3c1de200efc69efb1892c81de6565ab130dc352a564abc"

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
libc.so.6 \
libcrypto.so.3 \
libdecor-0.so.0 \
libdrm.so.2 \
libei.so.1 \
libepoxy.so.0 \
libgbm.so.1 \
libm.so.6 \
liboeffis.so.1 \
libpixman-1-0 \
libpixman-1.so.0 \
libsystemd.so.0 \
libtirpc.so.3 \
libwayland-client.so.0 \
libxcvt.so.0 \
libxshmfence.so.1 \
pkgconfig \
xkbcomp \
xkeyboard-config"

inherit rpm
