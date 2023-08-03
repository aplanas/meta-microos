SUMMARY = "X11 backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/X11 runtime library."
LICENSE = "MIT"

PV = "2.19.0"

RPM_NAME = "libva-x11-2-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "8bb8eee64425c09c1aafe8f302c7bb11e8c41307e7825a9ad8151c96261719504b54cbe3b71e695c0747e940b5693fd86b97e060c0ab8350c5949fea536dac1d"

RPROVIDES:${PN} += "libva-x11-2 \
libva-x11.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libc.so.6 \
libdrm.so.2 \
libva.so.2 \
libxcb-dri3.so.0 \
libxcb.so.1"

inherit rpm
