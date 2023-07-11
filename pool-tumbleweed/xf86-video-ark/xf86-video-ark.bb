SUMMARY = "Ark Logic video driver for the Xorg X server"
DESCRIPTION = "ark is an Xorg driver for Ark Logic video cards."
LICENSE = "MIT"

PV = "0.7.6"

RPM_NAME = "xf86-video-ark-0.7.6-1.3.aarch64.rpm"
RPM_HASH = "b804bd4fb007f9574801b17c0f2e80b17ad01abd91b9df3a80a1dea6e57f0d208e9663c3b3871b0ee0c756e71c2a0b76a913794b80892e10754c82572b1b0727"

RPROVIDES:${PN} += "xf86-video-ark"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
