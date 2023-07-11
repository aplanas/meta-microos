SUMMARY = "Framebuffer video driver for the Xorg X server"
DESCRIPTION = "fbdev is an Xorg driver for framebuffer devices. \
 \
This is a non-accelerated driver, the following framebuffer depths are \
supported: 8, 15, 16, 24. All visual types are supported for depth 8, \
and TrueColor visual is supported for the other depths. Multi-head \
configurations are supported."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "xf86-video-fbdev-0.5.0-3.5.aarch64.rpm"
RPM_HASH = "0803a7304c565f3bf6bc3bba58153d39f209e7ee01254b596594e597d76d25e301c09667bb330fef18ed8ccf29e5aad4f4c27414c5c4c99089d7047733a7bd26"

RPROVIDES:${PN} += "xf86-video-fbdev"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
