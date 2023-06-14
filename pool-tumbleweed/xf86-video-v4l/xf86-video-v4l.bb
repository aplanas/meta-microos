SUMMARY = "Video4linux video driver for the Xorg X server"
DESCRIPTION = "v4l is an Xorg driver for video4linux video cards. \
 \
It provides a Xvideo extension port for video overlay. Just add the \
driver to the module list within the module section of your \
configuration file if you want to use it. There are no config options."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "xf86-video-v4l-0.3.0-1.20.aarch64.rpm"
RPM_HASH = "878b0392725c3d79af6d7508174eadf91fb2e04f2f7f7b5b9a257a7d0ed4429805e6c3e941f145d480a01a643a9685e6f87d995ef062305767f5d65406289a84"

RPROVIDES:${PN} += "xf86-video-v4l"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
