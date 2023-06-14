SUMMARY = "Utility to monitor X11/Client conversations"
DESCRIPTION = "XSCOPE is a program to monitor the connections between the X11 window \
server and a client program."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "xscope-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "38b7d17e24eb0747b71b145275d86a6a8436399b43be4e1517c54963dbacde19b3078cf1344e3644b72c15369cf319faa30cbc358879e2c5f9e7e6ebc0c8fe59"

RPROVIDES:${PN} += "xscope"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
