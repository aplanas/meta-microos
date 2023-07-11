SUMMARY = "DRM backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/DRM runtime library."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-drm2-2.18.0-2.2.aarch64.rpm"
RPM_HASH = "da6f7f0cd7240c8d2ded82703dd987337a916ed083f67aaa7af242e35efd5b3226966643543e10c869fd078c38fd95eb9986c33ef2e8a4b0492f34114bd4cbcf"

RPROVIDES:${PN} += "libva-drm.so.2 \
libva-drm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libva.so.2"

inherit rpm
