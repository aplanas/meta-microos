SUMMARY = "User preference utility for X"
DESCRIPTION = "This program is used to set various user preference options of the \
display."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "xset-1.2.5-2.1.aarch64.rpm"
RPM_HASH = "a244cc6deb2cd64675faa8bf12c424d569c233bd3443dfe12e30f41a27081f01a531a077b2b15baa76df12ab13a96d3284ba9de02335c86bf8d00fd5beefba60"

RPROVIDES:${PN} += "xset"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
