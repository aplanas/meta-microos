SUMMARY = "X11 Damage Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Damage Extension allows applications to track modified regions \
of drawables."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-damage0-1.15-2.3.aarch64.rpm"
RPM_HASH = "090ca11ded070bee4665b3372cdc94708a077c1df501d098949dc7352de57047e48e5399b4fe092af80f0d3510fecac9fd6ef3ba4f504e5e96b2cd0ab055fdec"

RPROVIDES:${PN} += "libxcb-damage.so.0 \
libxcb-damage0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
