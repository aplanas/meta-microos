SUMMARY = "X11 DPMS Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-dpms0-1.16-1.1.aarch64.rpm"
RPM_HASH = "d2dfb2af05d065e2b033759c1d6018fc77115031c8d025945549d016beb0344f560f2f509c9e88d2ba7447ba6e17ef200a611e09dcd4f9ecc3c02cd9667b6110"

RPROVIDES:${PN} += "libxcb-dpms.so.0 \
libxcb-dpms0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
