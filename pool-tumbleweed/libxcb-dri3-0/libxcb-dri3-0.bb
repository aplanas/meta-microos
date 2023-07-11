SUMMARY = "X11 DRI3 Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-dri3-0-1.15-2.3.aarch64.rpm"
RPM_HASH = "7b55d062e748065cb178b177502710c6a35a27e3de3b9dbe2796fdf1a756afe29545881bb0538bc9a0cb1c3310ae3b983c738b32480031092513dfeaaf9638d7"

RPROVIDES:${PN} += "libxcb-dri3-0 \
libxcb-dri3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
