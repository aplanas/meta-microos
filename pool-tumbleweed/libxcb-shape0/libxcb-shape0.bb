SUMMARY = "X11 Shape Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
- X11 Nonrectangular Window Shape extension (Xshape)"
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-shape0-1.16-1.1.aarch64.rpm"
RPM_HASH = "8a5a4fb370174ca527572e0f142bcd6b92fe4d3c6794427e810519dd4b0189b29dce43e7196328aeb7a56dbcdd5531a6becfde5cb9deb807a0e77e1e4ac4d6c1"

RPROVIDES:${PN} += "libxcb-shape.so.0 \
libxcb-shape0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
