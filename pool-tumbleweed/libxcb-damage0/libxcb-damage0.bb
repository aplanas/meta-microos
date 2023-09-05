SUMMARY = "X11 Damage Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Damage Extension allows applications to track modified regions \
of drawables."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-damage0-1.16-1.1.aarch64.rpm"
RPM_HASH = "428437752555f46758c1321c4dac7c6309afda78f346c2370046aaf8dd47d08f512acda39d29195428b0b4e5d452fdb7abee1a6a20c901a721834183c118b67a"

RPROVIDES:${PN} += "libxcb-damage.so.0 \
libxcb-damage0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
