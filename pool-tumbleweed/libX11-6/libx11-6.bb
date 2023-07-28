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

PV = "1.8.6"

RPM_NAME = "libX11-6-1.8.6-1.1.aarch64.rpm"
RPM_HASH = "c812f66056d118fc0b04f0914a1d4c46b495996ceae832ba3ddce65e0d8c9f37c822b1db5c871253f5a2de362407614a7db65d555e0fb5df548ed1729a3164f1"

RPROVIDES:${PN} += "libX11-6 \
libX11.so.6 \
xorg-x11-libX11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-data \
libc.so.6 \
libxcb.so.1"

inherit rpm
