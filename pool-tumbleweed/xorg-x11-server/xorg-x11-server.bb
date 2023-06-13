SUMMARY = "X"
DESCRIPTION = "This package contains the X.Org Server."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "f2c9ebc57ea9e822580c073c31816fd6ffd79bb1acec1051f612c241c2c104ddef8afd66085b5744430e246dfd0feb9d63cd1b0b5e907038adee0eb715a5a4cd"

RPROVIDES:${PN} += "X11_ABI_ANSIC \
X11_ABI_EXTENSION \
X11_ABI_HAS_DPMS_GET_CAPABILITIES \
X11_ABI_VIDEODRV \
X11_ABI_XINPUT \
glamor \
glamor-egl \
libexa.so()(64bit) \
libfbdevhw.so()(64bit) \
libglamoregl.so()(64bit) \
libglx.so()(64bit) \
libint10.so()(64bit) \
libshadow.so()(64bit) \
libshadowfb.so()(64bit) \
libvgahw.so()(64bit) \
libwfb.so()(64bit) \
xf86-video-ast \
xf86-video-cirrus \
xf86-video-modesetting \
xorg-x11-driver-input \
xorg-x11-driver-video \
xorg-x11-server \
xorg-x11-server(aarch-64) \
xorg-x11-server-glx"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
Mesa \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libXau.so.6()(64bit) \
libXdmcp.so.6()(64bit) \
libXfont2.so.2()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdrm.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libgbm.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpciaccess.so.0()(64bit) \
libpixman-1-0 \
libpixman-1.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libxcvt.so.0()(64bit) \
libxshmfence.so.1()(64bit) \
pkgconfig \
update-alternatives \
xkbcomp \
xkeyboard-config \
xorg-x11-server-Xvfb"

inherit rpm
