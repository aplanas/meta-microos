SUMMARY = "X11 Keyboard Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xkb extends the ability to control the keyboard \
over what is offered by the X Window System core protocol."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-xkb1-1.16-1.1.aarch64.rpm"
RPM_HASH = "e51e5f9580b254d7d5e242073a480ae841e923f60c49ab18c3e4c733268de15c60be3024c7a6722d01107b019f4264dbdc1ad8e140876a9c4d3a8e2a6b01d81c"

RPROVIDES:${PN} += "libxcb-xkb.so.1 \
libxcb-xkb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
