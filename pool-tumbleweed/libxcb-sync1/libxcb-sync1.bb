SUMMARY = "X11 Sync Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-sync1-1.15-2.2.aarch64.rpm"
RPM_HASH = "3e59bc9cf9409f36b95515ba51cd0b3d173a0a8237d33ecc3fd7c4f8144fce82d882d7568d30af0fed1857277b17734d74c1b6a1950b19cd794b8edbb426eef0"

RPROVIDES:${PN} += "libxcb-sync.so.1 \
libxcb-sync1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
