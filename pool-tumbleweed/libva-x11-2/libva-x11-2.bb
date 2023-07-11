SUMMARY = "X11 backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/X11 runtime library."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-x11-2-2.18.0-2.2.aarch64.rpm"
RPM_HASH = "c84b6bd7f4f3e1022d4554bea75f0533c845280901c17fd2f10829d08cccef7a7260ca3492cc3954dc013962c60b498524f55569c1a2bb56e01fa81cd559a5bb"

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
