SUMMARY = "X11 core protocol C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb1-1.15-2.3.aarch64.rpm"
RPM_HASH = "c91c30362622ef94994d0a8963cb99aaf055126765ace245e0fbbff61d3f619e7b2720e08f449013fe1507c1be42feb521de58abd0e0a9fce5c056692b2869c0"

RPROVIDES:${PN} += "libxcb.so.1 \
libxcb1 \
xorg-x11-libxcb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libc.so.6"

inherit rpm
