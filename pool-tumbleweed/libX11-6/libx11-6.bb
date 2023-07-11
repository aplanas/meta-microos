SUMMARY = "Core X11 protocol client library"
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

RPM_NAME = "libX11-6-1.8.5-2.1.aarch64.rpm"
RPM_HASH = "6c15765a2cdbf2e9dda46b2865bde3b52d573006d1ac435fe83684bd8c10077353ecd1d9e240ab978555c0f9776efd89bcaa3b4cf0be1981a485a4c66779398c"

RPROVIDES:${PN} += "libX11-6 \
libX11.so.6 \
xorg-x11-libX11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-data \
libc.so.6 \
libxcb.so.1"

inherit rpm
