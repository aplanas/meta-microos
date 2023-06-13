SUMMARY = "X11 video Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Video Extension (Xv) extension provides support for video \
adaptors attached to an X display. It takes the approach that a \
display may have one or more video adaptors, each of which has one or \
more ports through which independent video streams pass."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xv0-1.15-2.2.aarch64.rpm"
RPM_HASH = "4438114dd1c15c6596b5da3105714b89aefeb2deed7a5237ac94dcc6a3fa9d89c977331e43094e550e1a26924776c2784ffb18356a7a25f86e50d4c83ddbcfd9"

RPROVIDES:${PN} += "libxcb-xv.so.0()(64bit) \
libxcb-xv0 \
libxcb-xv0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
