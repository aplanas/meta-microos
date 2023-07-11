SUMMARY = "X11 Render Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-render0-1.15-2.3.aarch64.rpm"
RPM_HASH = "fb6abd686ed7c480f33af8d4d27d4bf97641d4d6e2d9bea6ed429cefa27048721015134c7644e5c04d22262d37a651716ebab245f6f277187bcd4a86f849d68b"

RPROVIDES:${PN} += "libxcb-render.so.0 \
libxcb-render0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
