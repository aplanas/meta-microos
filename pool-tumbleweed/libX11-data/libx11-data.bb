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

PV = "1.8.6"

RPM_NAME = "libX11-data-1.8.6-1.1.noarch.rpm"
RPM_HASH = "b06849f8b8c7f9f206c83ef4284670b50b1926ab18615be6f3ac4f4b3eeec31fa42ee0672954fa2a5ad633417c61cd542a4e4bac2f62a0a3e8157d9cbd130832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libX11-data"

RDEPENDS:${PN} += ""

inherit rpm
