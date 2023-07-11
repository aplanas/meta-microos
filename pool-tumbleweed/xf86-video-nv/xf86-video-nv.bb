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

RPM_NAME = "xf86-video-nv-2.1.22-1.5.aarch64.rpm"
RPM_HASH = "3b99e6edae0f4382e34d6dea01c41ed080513614d93bf2ea0ed9d568847f1accfbc227b8c460de371f04a7cd83711b55212611df0b7ba8c65a417ded50e8bac9"

RPROVIDES:${PN} += "xf86-video-nv \
xorg-x11-driver-video-nvidia"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
