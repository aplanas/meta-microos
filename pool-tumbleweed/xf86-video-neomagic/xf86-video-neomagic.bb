SUMMARY = "Neomagic video driver for the Xorg X server"
DESCRIPTION = "neomagic is an Xorg driver for Neomagic video cards found in many laptop \
computers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "xf86-video-neomagic-1.3.1-1.2.aarch64.rpm"
RPM_HASH = "aa8e6f544f2f7a59a8aa8e51e3209db45f35c50aec104b6fd5dfe37f44229d9070931b361b1957a309b3d0d4150d9953e7d8849ac729e18bf1a5caf2ba3e7c57"

RPROVIDES:${PN} += "xf86-video-neomagic"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
