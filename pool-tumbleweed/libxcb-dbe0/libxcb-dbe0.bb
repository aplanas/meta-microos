SUMMARY = "X11 Dbe Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-dbe0-1.16-1.1.aarch64.rpm"
RPM_HASH = "f14c85fb95d6bbf3a3bee258844a61635097096c16b2662f73f1470aa0ebe8fdeca81e45735033dcd7ed047d9ce692757b877bfa79f6c1f82cf17e740a5b6605"

RPROVIDES:${PN} += "libxcb-dbe.so.0 \
libxcb-dbe0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
