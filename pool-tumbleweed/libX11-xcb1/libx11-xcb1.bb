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

RPM_NAME = "libX11-xcb1-1.8.5-2.1.aarch64.rpm"
RPM_HASH = "62cca328b9205a4f5b328f9fb90ae9050c07f38a53cae721bd58759596445fe79a064ae347b2dcaa6eaaa58e49572ded24822590fe4e1e0c253933e5d37ba4c1"

RPROVIDES:${PN} += "libX11-xcb.so.1 \
libX11-xcb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11-data"

inherit rpm
