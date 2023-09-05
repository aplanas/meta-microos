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

PV = "1.16"

RPM_NAME = "libxcb-xv0-1.16-1.1.aarch64.rpm"
RPM_HASH = "0fd75f79623682f65e6d3f998b00baf9f5628473ecf02b4c67d308393d0c175f5e82ca7b47d156f121257db668f0fb47eb703b92bd3ed039f74f2be89500f3b6"

RPROVIDES:${PN} += "libxcb-xv.so.0 \
libxcb-xv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
