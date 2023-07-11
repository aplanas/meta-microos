SUMMARY = "X11 Shape Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
- X11 Nonrectangular Window Shape extension (Xshape)"
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-shape0-1.15-2.3.aarch64.rpm"
RPM_HASH = "768b06fae9e22d89ebebc018d5f6ddc33d2375798e2ca0feadc40b953a9d0a082fd10731ecce191d0933df22058067e0825d29cb91e0ffbabbc33f9cf457e7a4"

RPROVIDES:${PN} += "libxcb-shape.so.0 \
libxcb-shape0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
