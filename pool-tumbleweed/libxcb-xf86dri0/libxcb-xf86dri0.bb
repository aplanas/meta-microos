SUMMARY = "X11 XFree86-DRI Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xf86dri0-1.15-2.3.aarch64.rpm"
RPM_HASH = "05b3c8046502bb266818e4dfa6b7a1ab65fdf0c1bade1564af0765cb8094c4403133052903d740c61902a6c396266e4b9ff3f418095aeee569822ea3b9087d47"

RPROVIDES:${PN} += "libxcb-xf86dri.so.0 \
libxcb-xf86dri0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
