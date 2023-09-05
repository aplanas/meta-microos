SUMMARY = "X11 Resource Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-res0-1.16-1.1.aarch64.rpm"
RPM_HASH = "baf1d0be239f7239d46e9d2df874b7bbde32ba1a743048c454805debd65bac722d1e4d30d8b00d04258f28d38654704a581c04f0390308ac6ab1b85a19005b59"

RPROVIDES:${PN} += "libxcb-res.so.0 \
libxcb-res0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
