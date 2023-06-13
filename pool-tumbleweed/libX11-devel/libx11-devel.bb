SUMMARY = "Development files for the Core X11 protocol library"
DESCRIPTION = "The X Window System is a network-transparent window system that was \
designed at MIT. X display servers run on computers with either \
monochrome or color bitmap display hardware. The server distributes \
user input to and accepts output requests from various client \
programs located either on the same machine or elsewhere in the \
network. Xlib is a C subroutine library that application programs \
(clients) use to interface with the window system by means of a \
stream connection. \
 \
This package contains the development headers for the library found \
in libX11-6 and libX11-xcb1."
LICENSE = "MIT"

PV = "1.8.5"

RPM_NAME = "libX11-devel-1.8.5-1.1.aarch64.rpm"
RPM_HASH = "b956f2c3b74e73e8ff4822a64a78456f85f8046bbb0211cdb34115860c1591f52db44c5c914a09e9f302b015c35972aec42bb4570fdc3102f2e4b8b5e2897435"

RPROVIDES:${PN} += "libX11-devel \
libX11-devel(aarch-64) \
pkgconfig(x11) \
pkgconfig(x11-xcb) \
xorg-x11-libX11-devel \
xorgproto-devel:/usr/include/X11/extensions/XKBgeom.h"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libX11-6 \
libX11-xcb1 \
pkgconfig(kbproto) \
pkgconfig(x11) \
pkgconfig(xcb) \
pkgconfig(xproto)"

inherit rpm
