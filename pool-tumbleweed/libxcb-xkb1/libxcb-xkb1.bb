SUMMARY = "X11 Keyboard Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xkb extends the ability to control the keyboard \
over what is offered by the X Window System core protocol."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xkb1-1.15-2.3.aarch64.rpm"
RPM_HASH = "50977f855bef978421ce31a04367e0023b73e0a92b90ab67dcb338bd2ebf4cd33c97832c62771f327abca3a772076de8eb3074550c70587b97dfb3da773ef013"

RPROVIDES:${PN} += "libxcb-xkb.so.1 \
libxcb-xkb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
