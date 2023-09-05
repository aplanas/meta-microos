SUMMARY = "X11 RandR Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Resize, Rotate and Reflect Extension (RandR) allows clients to \
dynamically change X screens, so as to resize, to change the \
orientation and layout of the root window of a screen."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-randr0-1.16-1.1.aarch64.rpm"
RPM_HASH = "f9c94af6cf8a6d2fb68aaa1ced286289145fe521fd698ab826159b0ee4c3b56d0b5726c5ebfd5d6d8132cae23819ddac2bf966d10860169c8ae280b76f64f9f8"

RPROVIDES:${PN} += "libxcb-randr.so.0 \
libxcb-randr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
