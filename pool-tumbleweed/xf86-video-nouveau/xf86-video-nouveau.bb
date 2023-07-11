SUMMARY = "Accelerated Open Source driver for nVidia cards"
DESCRIPTION = "The nouveau project aims to build high-quality, open source drivers for nVidia \
cards. “Nouveau” [nuvo] is the French word for “new”."
LICENSE = "MIT"

PV = "1.0.17"

RPM_NAME = "xf86-video-nouveau-1.0.17-4.5.aarch64.rpm"
RPM_HASH = "ed19474a652330affe13c5c11784346685a133b58657a0cb6ba38ff5affa158710f8f3d48ecc262ff25a0572bbd14903ac51a46c8d8ed39e397a326e1f5970b3"

RPROVIDES:${PN} += "xf86-video-nouveau \
xorg-x11-driver-video-nouveau"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-nouveau.so.2 \
libdrm.so.2 \
libudev.so.1 \
xorg-x11-server"

inherit rpm
