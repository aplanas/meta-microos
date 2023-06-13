SUMMARY = "ATI Rage 128 video driver for the Xorg X server"
DESCRIPTION = "r128 is an Xorg driver for ATI Rage 128 video cards. \
 \
It contains full support for 8, 15, 16 and 24 bit pixel depths, hardware \
acceleration of drawing primitives, hardware cursor, video modes up to \
1800x1440 @ 70Hz, doublescan modes (e.g., 320x200 and 320x240), gamma \
correction at all pixel depths, a fully programming dot clock and robust \
text mode restoration for VT switching. Dualhead is supported on M3/M4 \
mobile chips."
LICENSE = "MIT"

PV = "6.12.1"

RPM_NAME = "xf86-video-r128-6.12.1-1.2.aarch64.rpm"
RPM_HASH = "c71489be792ebb58ea0583a7029d43ecbbbfb7ab7bbf9271cbef82ae1ffe5b633677e2a74eeaf0729f89899872ac036fb318a155c8dd210ae13a516de5f85043"

RPROVIDES:${PN} += "xf86-video-r128 \
xf86-video-r128(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
