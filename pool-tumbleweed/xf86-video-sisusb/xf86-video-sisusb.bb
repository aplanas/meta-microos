SUMMARY = "SiS and XGI video driver for the Xorg X server"
DESCRIPTION = "sis is an Xorg driver for SiS (Silicon Integrated Systems) and XGI video \
cards. \
 \
The driver is accelerated and provides support for colordepths of 8, 16 \
and 24 bpp. XVideo, Render and other extensions are supported as well."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.9.7"

RPM_NAME = "xf86-video-sisusb-0.9.7-1.29.aarch64.rpm"
RPM_HASH = "d9f6d464e0259eb669904a9f2569a0724d1a69ca43dec77162a64fba63ed153c6cf56271b8f3359af4c73daf864999f78545496282131c30ce2d5d1944df7020"

RPROVIDES:${PN} += "xf86-video-sisusb"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
