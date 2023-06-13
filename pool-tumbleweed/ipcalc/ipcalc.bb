SUMMARY = "IPv4/IPv6 tool assisting in network calculations on the command line"
DESCRIPTION = "ipcalc is a modern tool to assist in network address calculations for IPv4 and \
IPv6. It acts both as a tool to output human readable information about a \
network or address, as well as a tool suitable to be used by scripts or other \
programs.  It supports printing a summary about the provided network address, \
multiple command line options per information to be printed, transparent IPv6 \
support, and in addition it will use libGeoIP if available to provide \
geographic information."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "ipcalc-1.0.2-1.2.aarch64.rpm"
RPM_HASH = "0bf6507d21c2b1a3fd25c374214f5f9c32a30b6cf56f1f6c82c42041565d54cc21b07b677a73ae725ba2529da12dde484c200acad421950e925f749c180fd9b9"

RPROVIDES:${PN} += "ipcalc \
ipcalc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
