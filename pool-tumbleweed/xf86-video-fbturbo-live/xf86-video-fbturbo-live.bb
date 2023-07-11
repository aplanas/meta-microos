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

RPM_NAME = "xf86-video-fbturbo-live-0.4.git.1444169281.f9a6ed7-3.9.aarch64.rpm"
RPM_HASH = "34bc3d5ac1d03b460f351312fc7321c986aed1cd3f7974cce116cb1d14ef1db68f48cf88dc34bbef90354baf0ddb2665435d92571086a50f9b28c9d2f987d08a"

RPROVIDES:${PN} += "xf86-video-fbturbo-live"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
