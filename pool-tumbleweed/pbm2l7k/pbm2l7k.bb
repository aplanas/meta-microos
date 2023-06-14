SUMMARY = "Driver for Lexmark Printers 7000, 7200, and 5700"
DESCRIPTION = "A driver for Lexmark printers 7000, 7200, and 5700. This driver \
translates PBM (Portable Bitmap) into the printer protocol for the \
Lexmark printers 7000, 7200, and 5700. \
 \
 \
 \
Authors: \
-------- \
    Henryk Paluch <paluch@bimbo.fjfi.cvut.cz>"
LICENSE = "GPL-2.0+"

PV = "990321"

RPM_NAME = "pbm2l7k-990321-950.25.aarch64.rpm"
RPM_HASH = "fbebd6aea4790618a12d29555370e3594bca128c1aefa5eb3f83b76bf7b675e4510dfb0f8b796e457c5c42bf8fe28ab719d26ff69a6e1d6e635b69d2c20b84ce"

RPROVIDES:${PN} += "lexmark7000linux \
pbm2l7k"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
