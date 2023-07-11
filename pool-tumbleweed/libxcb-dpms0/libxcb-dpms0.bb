SUMMARY = "X11 DPMS Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-dpms0-1.15-2.3.aarch64.rpm"
RPM_HASH = "9f59773d8c730d26dbe426d472163a513f88095473be444c3830df974b47312eb704ea79d5ffa0665c9356f833716a0b5006a30eb5c1282ed18f6706331717d4"

RPROVIDES:${PN} += "libxcb-dpms.so.0 \
libxcb-dpms0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
