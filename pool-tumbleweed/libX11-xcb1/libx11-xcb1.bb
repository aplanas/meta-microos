SUMMARY = "XCB X11 protocol client library"
DESCRIPTION = "The X Window System is a network-transparent window system that was \
designed at MIT. X display servers run on computers with either \
monochrome or color bitmap display hardware. The server distributes \
user input to and accepts output requests from various client \
programs located either on the same machine or elsewhere in the \
network. Xlib is a C subroutine library that application programs \
(clients) use to interface with the window system by means of a \
stream connection."
LICENSE = "MIT"

PV = "1.8.5"

RPM_NAME = "libX11-xcb1-1.8.5-1.1.aarch64.rpm"
RPM_HASH = "02b4aeeee8035f50e699e82e9d6558349682172ebd1f65d88aec29885a0d204e0467815290a4be8bba3c2fb294e88f247891218c954a3c3a1f8eaa8bba491cde"

RPROVIDES:${PN} += "libX11-xcb.so.1()(64bit) \
libX11-xcb1 \
libX11-xcb1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11-data"

inherit rpm
