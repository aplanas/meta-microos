SUMMARY = "Number 9 I128 video driver for the Xorg X server"
DESCRIPTION = "i128 is an Xorg driver for Number 9 I128 video cards. \
 \
The driver is accelerated and provides support for all versions of the \
I128 chip family, including the SGI flatpanel configuration. Multi-head \
configurations are supported."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "xf86-video-i128-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "c126630f71f1f9f8aecd8fef6a5175f581027d67d650487a30b6a0dbbfbbc471e667911707e1cb72a1e93b7fc513c6bf3fbaeb866560220104e240599251d0a3"

RPROVIDES:${PN} += "xf86-video-i128 \
xf86-video-i128(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
