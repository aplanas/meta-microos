SUMMARY = "Generic VESA video driver for the Xorg X server"
DESCRIPTION = "vesa is an Xorg driver for Generic VESA video cards. \
 \
It can drive most VESA-compatible video cards, but only makes use of the \
basic standard VESA core that is common to these cards. The driver \
supports depths 8, 15 16 and 24."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "xf86-video-vesa-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "cfe5b5063ab90b78ea4a306d1a8cfb73d24c5330e3376a8e6b39db433d99b736416be390e7c2dd27f28e95718afbec14e9a5dc9968f75f0753ff53ce79487ca1"

RPROVIDES:${PN} += "xf86-video-vesa"

RDEPENDS:${PN} += "X11-ABI-HAS-DPMS-GET-CAPABILITIES \
X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
