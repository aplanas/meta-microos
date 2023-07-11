SUMMARY = "Utility to monitor X11/Client conversations"
DESCRIPTION = "XSCOPE is a program to monitor the connections between the X11 window \
server and a client program."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "xscope-1.4.4-1.2.aarch64.rpm"
RPM_HASH = "a9388b87e8d1d539e6af5e324da8b5721e0ab4b8a52321dca16ccb4bf44f263f6ec3e0c33b5112a886407480dff528043052a093472359093a9259946748571d"

RPROVIDES:${PN} += "xscope"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
