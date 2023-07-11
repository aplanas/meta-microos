SUMMARY = "X11 Present Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-present0-1.15-2.3.aarch64.rpm"
RPM_HASH = "4a4f159c7a956a32d730041018a6f262c6853b06d9780ff092ffd98b7e5bbfd54e588f468fab5b5e74103cb1f383a090d0b263b0df530c7fcbc9db6424ac233d"

RPROVIDES:${PN} += "libxcb-present.so.0 \
libxcb-present0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
