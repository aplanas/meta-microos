SUMMARY = "IPv4/IPv6 tool assisting in network calculations on the command line"
DESCRIPTION = "ipcalc is a modern tool to assist in network address calculations for IPv4 and \
IPv6. It acts both as a tool to output human readable information about a \
network or address, as well as a tool suitable to be used by scripts or other \
programs.  It supports printing a summary about the provided network address, \
multiple command line options per information to be printed, transparent IPv6 \
support, and in addition it will use libGeoIP if available to provide \
geographic information."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "ipcalc-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "2449073b498f6d417cf7707499bf4b274852a7d5463a9487bd6ac1d7dd9271934f1a80bc578d2ea5d9a3e0921b1c6c180ed17e1179b9559c7e6bae7740b042b0"

RPROVIDES:${PN} += "ipcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
