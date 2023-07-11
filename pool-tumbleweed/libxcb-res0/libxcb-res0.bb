SUMMARY = "X11 Resource Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-res0-1.15-2.3.aarch64.rpm"
RPM_HASH = "50e1a2aaf0970e3754626f4656d7d1b798d5e518d2b99eda1fce9e1a852b5d2ee197e90e66de75341162e8dab074e2146ef806c950175ba0b78b96fd7fd732a1"

RPROVIDES:${PN} += "libxcb-res.so.0 \
libxcb-res0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
