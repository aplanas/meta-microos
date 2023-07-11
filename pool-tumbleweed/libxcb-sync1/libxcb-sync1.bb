SUMMARY = "X11 Sync Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-sync1-1.15-2.3.aarch64.rpm"
RPM_HASH = "4c3541773c9f2d6f36b2be49687fc6df1bd791e3cd38bfdaeb5e0f56bbc7823bb476365e2d54aaf4844b134dcac85b8eaed33971ecf185b01499795b580b3040"

RPROVIDES:${PN} += "libxcb-sync.so.1 \
libxcb-sync1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
