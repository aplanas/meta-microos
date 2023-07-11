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

RPM_NAME = "libxcb-xv0-1.15-2.3.aarch64.rpm"
RPM_HASH = "4e5f6a7580043cf99ba7bb059e2afc050d4a43324e6dea4b81871f2ae9fe921a510436ddc5c7562fc0d70e095665f74ae26f5ac96f2682fe8204bfac9bc9cbad"

RPROVIDES:${PN} += "libxcb-xv.so.0 \
libxcb-xv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
