SUMMARY = "X11 Xfixes Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Fixes extension provides applications with work-arounds for \
various limitations in the core protocol."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xfixes0-1.15-2.2.aarch64.rpm"
RPM_HASH = "9fb757c5e9bb7c411cb5786a6277126a43e956612b7a6a03d0a5df4114e0a0dfe734287bff9904e0bc03b4265fff23d5e261060e9b78eae8121abfe5cbfb456a"

RPROVIDES:${PN} += "libxcb-xfixes.so.0 \
libxcb-xfixes0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
