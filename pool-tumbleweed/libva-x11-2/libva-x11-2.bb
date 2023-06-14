SUMMARY = "X11 backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/X11 runtime library."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-x11-2-2.18.0-2.1.aarch64.rpm"
RPM_HASH = "8ee60f82e1ebd17763323dad969bb3b58a29a2cc36fd52d7b4817102a7ac61648f047cc6f67726929c8206d9d16b7cbb66fb8b681b5594013406f8c27902e9ce"

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
