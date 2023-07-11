SUMMARY = "Shared data for the Core X11 protocol library"
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

RPM_NAME = "libX11-data-1.8.5-2.1.noarch.rpm"
RPM_HASH = "9f6c21e0be5bc2805686a6a430a7605cde2fe3cba13ddb20a1278f2d05e9204afa3c65f3c69c2acc630cad9dc4d366be644b3d5303ef5903b12f79ca67e8f32b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libX11-data"

RDEPENDS:${PN} += ""

inherit rpm
