SUMMARY = "X11 GLX Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-glx0-1.15-2.3.aarch64.rpm"
RPM_HASH = "bc5adafbceed4a32bd1d29510a522c2f6099ee8410719a18f20f8c6969a33a6973c17b9544e6d8c4e8a97ed3feafd08a1895493f60b5e88e4dcb345d6609beea"

RPROVIDES:${PN} += "libxcb-glx.so.0 \
libxcb-glx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
