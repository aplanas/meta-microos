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

RPM_NAME = "libX11-6-1.8.5-1.1.aarch64.rpm"
RPM_HASH = "8f3695814f849700b295981abf45b9202ee00768623c02a22951d268287578ab1ff52a5e00e02a4b5cff828af590a0bb3419307efbd190382507b4556b9a6844"

RPROVIDES:${PN} += "libX11-6 \
libX11-6(aarch-64) \
libX11.so.6()(64bit) \
xorg-x11-libX11"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-data \
libc.so.6(GLIBC_2.34)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
