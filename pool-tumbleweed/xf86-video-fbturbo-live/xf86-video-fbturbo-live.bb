SUMMARY = "Xorg DDX driver for ARM devices (Allwinner, RPi and others)"
DESCRIPTION = "Video driver, primarily optimized for the devices powered by the Allwinner SoC \
(A10, A13, A20). It can use some of the 2D/3D hardware acceleration features. \
 \
And because this driver is based on xf86-video-fbdev (with none of the original \
features stripped), it actually supports all the same hardware as \
xf86-video-fbdev. Essentially, xf86-video-fbturbo can be just used as a drop-in \
replacement and run on practically any Linux system. There will be no real \
difference on x86, but any ARM based system should see better performance \
thanks to some additional optimizations (the elimination of ShadowFB layer, ARM \
NEON/VFP code for dealing with uncached framebuffer reads, automatic backing \
store management for faster window moves)."
LICENSE = "X11 & GPL-2.0-or-later"

PV = "0.4.git.1444169281.f9a6ed7"

RPM_NAME = "xf86-video-fbturbo-live-0.4.git.1444169281.f9a6ed7-3.8.aarch64.rpm"
RPM_HASH = "39a41e1a9e19adf000ed5711d24779a5a695213c1a295add7171d2f55fa8a91d3613d2641662dcb1d423bd1d7be50427ba74896d1acec9aaca9d087993bb32d9"

RPROVIDES:${PN} += "xf86-video-fbturbo-live \
xf86-video-fbturbo-live(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
