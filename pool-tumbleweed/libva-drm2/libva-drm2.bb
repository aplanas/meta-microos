SUMMARY = "DRM backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/DRM runtime library."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-drm2-2.18.0-2.1.aarch64.rpm"
RPM_HASH = "a6df2d4674a315fe2ffea5eaeff981bce909224377ce2bb68bcd55b78779861b8fe62e1677cae43b888b9724743d42a92898812ae7b73338fedaab2e199531c0"

RPROVIDES:${PN} += "libva-drm.so.2()(64bit) \
libva-drm2 \
libva-drm2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libva.so.2()(64bit)"

inherit rpm
