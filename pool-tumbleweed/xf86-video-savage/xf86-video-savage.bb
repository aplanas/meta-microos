SUMMARY = "S3 Savage video driver for the Xorg X server"
DESCRIPTION = "savage is an Xorg driver for S3 Savage video cards. \
 \
2D, 3D, and Xv acceleration is supported on all chips except the \
Savage2000 (2D only). Dualhead operation is supported on MX, IX, and \
SuperSavage chips."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "xf86-video-savage-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "9128580fd23e1dbd3363df0c70d1a70c583ac1aefa908d5d8142fb35b55ce61d32fd57786d583eddc40beb673d1ff0e7925b9cf9afdb0154c785d25f806926c3"

RPROVIDES:${PN} += "xf86-video-savage \
xf86-video-savage(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
