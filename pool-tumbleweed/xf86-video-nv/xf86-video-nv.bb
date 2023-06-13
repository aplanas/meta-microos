SUMMARY = "NVIDIA video driver for the Xorg X server"
DESCRIPTION = "nv is an Xorg driver for NVIDIA video cards. \
 \
The driver supports 2D acceleration and provides support for the \
following framebuffer depths: 8, 15, 16 (except Riva128) and 24. All \
visual types are supported for depth 8, TrueColor and DirectColor \
visuals are supported for the other depths with the exception of the \
Riva128 which only supports TrueColor in the higher depths."
LICENSE = "MIT"

PV = "2.1.22"

RPM_NAME = "xf86-video-nv-2.1.22-1.4.aarch64.rpm"
RPM_HASH = "dfbf56144be857e0d1b92df339b9b3eb2955150b80859624032e5494ede2b1d6d451627c0d667cb26e068207acf49dec1a8d470d2d086ed133324521adbdc8dd"

RPROVIDES:${PN} += "xf86-video-nv \
xf86-video-nv(aarch-64) \
xorg-x11-driver-video-nvidia"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
