SUMMARY = "GLX backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/GLX runtime library."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-glx2-2.18.0-2.1.aarch64.rpm"
RPM_HASH = "ee080e259ddfce60141f804bee1d26dc687b0d094b2f0f6ba94364c9dee5d535b19059af58dce7291c150e572d3d1e05761d846858a389e353aaf5d8fa0278e9"

RPROVIDES:${PN} += "libva-glx.so.2()(64bit) \
libva-glx2 \
libva-glx2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libva-x11.so.2()(64bit) \
libva.so.2()(64bit)"

inherit rpm
