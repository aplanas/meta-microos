SUMMARY = "Video4linux video driver for the Xorg X server"
DESCRIPTION = "v4l is an Xorg driver for video4linux video cards. \
 \
It provides a Xvideo extension port for video overlay. Just add the \
driver to the module list within the module section of your \
configuration file if you want to use it. There are no config options."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "xf86-video-v4l-0.3.0-1.21.aarch64.rpm"
RPM_HASH = "20e49b96089fac607485f6cae74acf7eb526ff49bfabc6235aaa79f296c62c9d140fbd246fbf3892c892d8af0a06aae662f0ddf41f6f1daaf39cec5bcacded10"

RPROVIDES:${PN} += "xf86-video-v4l"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
