SUMMARY = "Matrox video driver for the Xorg X server"
DESCRIPTION = "mga is an Xorg driver for Matrox video cards. \
 \
The driver is fully accelerated, and provides support for the following \
framebuffer depths: 8, 15, 16, 24, and an 8+24 overlay mode. All visual \
types are supported for depth 8, and both TrueColor and DirectColor \
visuals are supported for the other depths except 8+24 mode which \
supports PseudoColor, GrayScale and TrueColor. Multi-card configurations \
are supported. XVideo is supported on G200 and newer systems, with \
either TexturedVideo or video overlay. The second head of dual-head \
cards is supported for the G450 and G550. Support for the second head on \
G400 cards requires a binary-only 'mga_hal' module that is available \
from Matrox, and may be on the CD supplied with the card. That module \
also provides various other enhancements, and may be necessary to use \
the DVI (digital) output on the G550 (and other cards)."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "xf86-video-mga-2.0.1-1.5.aarch64.rpm"
RPM_HASH = "185f11b9218260990811a330299c7a1c71bb1d304bbd5fe4c147de788b14502e03298ac8a87c34aeec3dffa9d4aba1472c649b1b16bf6aeaf2c10d072754d410"

RPROVIDES:${PN} += "xf86-video-mga"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
