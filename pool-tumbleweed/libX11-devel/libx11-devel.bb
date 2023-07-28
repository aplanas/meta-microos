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

PV = "1.8.6"

RPM_NAME = "libX11-devel-1.8.6-1.1.aarch64.rpm"
RPM_HASH = "4b899dbe2d8146b552788acbb6e029c5b629cda887f33ce4cb775d2e9c8f1a53e7c573a0e83692796ddd77fad3745a076abf0203da228693ad768c889a0cf160"

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
