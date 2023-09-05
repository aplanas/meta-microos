SUMMARY = "X11 Sync Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-sync1-1.16-1.1.aarch64.rpm"
RPM_HASH = "d306c46b5a867acb5a1699294d396c426d494b98aa57664423829b6c17568a89cef41ed5b85fb3bfc5cee8832388c639a1f52535fc44a55db16f0db7293b61aa"

RPROVIDES:${PN} += "libxcb-sync.so.1 \
libxcb-sync1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
