SUMMARY = "X"
DESCRIPTION = "This package contains the X.Org Server."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "f2c9ebc57ea9e822580c073c31816fd6ffd79bb1acec1051f612c241c2c104ddef8afd66085b5744430e246dfd0feb9d63cd1b0b5e907038adee0eb715a5a4cd"

RPROVIDES:${PN} += "X11-ABI-ANSIC \
X11-ABI-EXTENSION \
X11-ABI-HAS-DPMS-GET-CAPABILITIES \
X11-ABI-VIDEODRV \
X11-ABI-XINPUT \
glamor \
glamor-egl \
libexa.so \
libfbdevhw.so \
libglamoregl.so \
libglx.so \
libint10.so \
libshadow.so \
libshadowfb.so \
libvgahw.so \
libwfb.so \
xf86-video-ast \
xf86-video-cirrus \
xf86-video-modesetting \
xorg-x11-driver-input \
xorg-x11-driver-video \
xorg-x11-server \
xorg-x11-server-glx"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
Mesa \
fillup \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libXau.so.6 \
libXdmcp.so.6 \
libXfont2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libm.so.6 \
libpciaccess.so.0 \
libpixman-1-0 \
libpixman-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
libxcvt.so.0 \
libxshmfence.so.1 \
pkgconfig \
update-alternatives \
xkbcomp \
xkeyboard-config \
xorg-x11-server-Xvfb"

inherit rpm
