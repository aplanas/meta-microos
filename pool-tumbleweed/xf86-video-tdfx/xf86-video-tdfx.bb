SUMMARY = "3Dfx video driver for the Xorg X server"
DESCRIPTION = "tdfx is an Xorg driver for 3Dfx video cards."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "xf86-video-tdfx-1.5.0-1.19.aarch64.rpm"
RPM_HASH = "8e515329327e4f145725015ff5199d93d57cb78d6c97e04822ed5ba37b001409bb1eb7f82ab191e545408bb047535c3cdc9a7c53eb47b8798a06a5d537d6fa54"

RPROVIDES:${PN} += "xf86-video-tdfx \
xf86-video-tdfx(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
