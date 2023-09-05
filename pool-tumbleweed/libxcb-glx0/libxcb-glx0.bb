SUMMARY = "X11 GLX Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-glx0-1.16-1.1.aarch64.rpm"
RPM_HASH = "45ca95c7de641ebd8b170f2c7b4317b1fa9c6547ba0022a937a4ff60f888eeb829073ddb8aa9a8a13ba41cd3559e936f0ef9c9b3b6f40edc24a29e8d29845e12"

RPROVIDES:${PN} += "libxcb-glx.so.0 \
libxcb-glx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
