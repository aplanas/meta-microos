SUMMARY = "Ark Logic video driver for the Xorg X server"
DESCRIPTION = "ark is an Xorg driver for Ark Logic video cards."
LICENSE = "MIT"

PV = "0.7.6"

RPM_NAME = "xf86-video-ark-0.7.6-1.2.aarch64.rpm"
RPM_HASH = "029da1e7ce718ac21e214af60f8a1fa62f15ea544885f2e666e267f75711d96d6d259d46b1e1a5b2c13d6c4ce0c06741c4dc7e31da2892cf0f9d0871e3cbb69c"

RPROVIDES:${PN} += "xf86-video-ark \
xf86-video-ark(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
