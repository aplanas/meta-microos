SUMMARY = "Accelerated Open Source driver for nVidia cards"
DESCRIPTION = "The nouveau project aims to build high-quality, open source drivers for nVidia \
cards. “Nouveau” [nuvo] is the French word for “new”."
LICENSE = "MIT"

PV = "1.0.17"

RPM_NAME = "xf86-video-nouveau-1.0.17-4.4.aarch64.rpm"
RPM_HASH = "2dafd64c08959cddc0cefc2337fef1829478a955857d05042b5defa01d5c2b3b1c56042ddb3ed9d7b850fe6acce68cd1c76505c4c88f67bebb1289ae1493c202"

RPROVIDES:${PN} += "xf86-video-nouveau \
xf86-video-nouveau(aarch-64) \
xorg-x11-driver-video-nouveau"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libdrm_nouveau.so.2()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
xorg-x11-server"

inherit rpm
