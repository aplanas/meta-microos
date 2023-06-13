SUMMARY = "X11 GLX Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-glx0-1.15-2.2.aarch64.rpm"
RPM_HASH = "bd6f6124c98ce7ea7429e056c7502a37a4db30ea3946d9393aeec4534c215307e3210479124f4e1b9c05b132222289daca2dfee34750cefbc51cd330dcf72c9d"

RPROVIDES:${PN} += "libxcb-glx.so.0()(64bit) \
libxcb-glx0 \
libxcb-glx0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
