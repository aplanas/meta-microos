SUMMARY = "3Dfx video driver for the Xorg X server"
DESCRIPTION = "tdfx is an Xorg driver for 3Dfx video cards."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "xf86-video-tdfx-1.5.0-1.20.aarch64.rpm"
RPM_HASH = "8c94ab9ca0b2b8a188383b5cc930fba10bb29b28e9c6624bae3bffb174e3905835ddd19002bbf8e527e7e826d96416cfd07dc60036fa92f106c06b62856393e9"

RPROVIDES:${PN} += "xf86-video-tdfx"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
