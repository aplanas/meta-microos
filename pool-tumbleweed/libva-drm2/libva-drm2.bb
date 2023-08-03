SUMMARY = "DRM backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/DRM runtime library."
LICENSE = "MIT"

PV = "2.19.0"

RPM_NAME = "libva-drm2-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "e106c071819e38f08b68e01922848dfbfa91ff7d5d059f6fa772d46a6f628f4501ee57b0b302b024dd077261ce02e86129f7281620a3d2777b3cc32672625052"

RPROVIDES:${PN} += "libva-drm.so.2 \
libva-drm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libva.so.2"

inherit rpm
