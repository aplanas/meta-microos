SUMMARY = "SiS and XGI video driver for the Xorg X server"
DESCRIPTION = "sis is an Xorg driver for SiS (Silicon Integrated Systems) and XGI video \
cards. \
 \
The driver is accelerated and provides support for colordepths of 8, 16 \
and 24 bpp. XVideo, Render and other extensions are supported as well."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.12.0"

RPM_NAME = "xf86-video-sis-0.12.0-1.17.aarch64.rpm"
RPM_HASH = "0f0308c8118ba8ad314e0bc718550749a468b24bbac11dca27b5ca7f30c90983ea684237d288614d0ce1aec8a9cf444ce754501850f1df05bae67ce49716b4ef"

RPROVIDES:${PN} += "xf86-video-sis"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
