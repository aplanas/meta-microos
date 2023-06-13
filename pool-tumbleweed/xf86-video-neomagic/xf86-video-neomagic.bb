SUMMARY = "Neomagic video driver for the Xorg X server"
DESCRIPTION = "neomagic is an Xorg driver for Neomagic video cards found in many laptop \
computers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "xf86-video-neomagic-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "23eeea6b835b79dd521275bf7a1b81ddba9c58eeda194254efeb7bae4b789581c4ec83d6b60dafe1aa0148e2d682edd47e2618133a995f163d98f6b1c35f2091"

RPROVIDES:${PN} += "xf86-video-neomagic \
xf86-video-neomagic(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
