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

PV = "0.4.0"

RPM_NAME = "xf86-video-fbturbo-0.4.0-4.9.aarch64.rpm"
RPM_HASH = "13f9a1a0f823f2cb1279662ea9f767a7c2bbb7aa8426396e63a38975d59dd284d2720f56ec3b7bfbcb19b8e19c22926c4b269d86e5e0a4fce5c3a70e16da65d1"

RPROVIDES:${PN} += "xf86-video-fbturbo"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
