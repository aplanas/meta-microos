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

RPM_NAME = "xf86-video-r128-6.12.1-1.3.aarch64.rpm"
RPM_HASH = "68b7765717ee5f6eaf778c7aa5604bfe2e6856b2c35f759e88e295c2e51bd262b1b6c58c6b196dbbe5d0130c61df90605c0d86a4de76caf24505795823ec51dc"

RPROVIDES:${PN} += "xf86-video-r128"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
