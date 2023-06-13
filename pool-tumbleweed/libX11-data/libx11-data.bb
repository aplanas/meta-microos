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

RPM_NAME = "libX11-data-1.8.5-1.1.noarch.rpm"
RPM_HASH = "2b133080087a4b63ee9af81fb0d79c8afc66f9f05090bbc2a78779dc8f161cbd8595292bfea2f248dbd8c4ca44f8e6f9fbeb0f7acfc71c8dfcc42fcabda82c69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libX11-data"

RDEPENDS:${PN} += ""

inherit rpm
