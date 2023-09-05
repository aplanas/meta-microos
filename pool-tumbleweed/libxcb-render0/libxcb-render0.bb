SUMMARY = "X11 Render Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-render0-1.16-1.1.aarch64.rpm"
RPM_HASH = "f2e25126768cbba8e2afdf7c6dec1e0a8bea9976023832db5f7e1cb27a7e328a0edda92287ea9cc6d02a213b87c76cbfeaad1ba16d3e70d3fa8e258e0b6fc522"

RPROVIDES:${PN} += "libxcb-render.so.0 \
libxcb-render0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
