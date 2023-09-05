SUMMARY = "X11 DRI2 Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-dri2-0-1.16-1.1.aarch64.rpm"
RPM_HASH = "e087443e2f4b78c34e1d042f07604a6723e3e9d419a413ef2c7606df73dbfe5fd70c44819634be45931454a032f7417268cde124fc239ab2397504ccc72d03c4"

RPROVIDES:${PN} += "libxcb-dri2-0 \
libxcb-dri2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
