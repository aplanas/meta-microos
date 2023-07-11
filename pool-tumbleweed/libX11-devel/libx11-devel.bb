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

RPM_NAME = "libX11-devel-1.8.5-2.1.aarch64.rpm"
RPM_HASH = "25a42706fdabc2ed902963801fcd3fc6e6edb68088ab3bee57d871bd0572cbcaaf79bf8fe73ae81e2d6129c34db3f7b1918106ba180879de4eeb8b4e2059ea78"

RPROVIDES:${PN} += "libX11-devel \
pkgconfig-x11 \
pkgconfig-x11-xcb \
xorg-x11-libX11-devel \
xorgproto-devel-/usr/include/X11/extensions/XKBgeom.h"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libX11-6 \
libX11-xcb1 \
pkgconfig-kbproto \
pkgconfig-x11 \
pkgconfig-xcb \
pkgconfig-xproto"

inherit rpm
