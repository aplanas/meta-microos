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

PV = "1.8.6"

RPM_NAME = "libX11-xcb1-1.8.6-1.1.aarch64.rpm"
RPM_HASH = "63fbadc00daf5c91aaf2dec769b57dae27c4e31bdbfd236b2c778d433bee71f869ff35a7ebe76c1ebe153baca15c6a64328388abe7272fb856210b5506be1d5d"

RPROVIDES:${PN} += "libX11-xcb.so.1 \
libX11-xcb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11-data"

inherit rpm
