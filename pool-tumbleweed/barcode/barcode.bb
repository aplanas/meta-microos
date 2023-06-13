SUMMARY = "Text-Mode Barcode Creation Utility"
DESCRIPTION = "GNU Barcode is meant to meet most barcode creation needs with a \
conventional printer. It can create printouts for the conventional \
product tagging standards: UPC-A, UPC-E, EAN-13, EAN-8, ISBN, as well \
as a few other formats. Output is generated in either PostScript or \
Encapsulated PostScript format."
LICENSE = "GPL-3.0-or-later"

PV = "0.99"

RPM_NAME = "barcode-0.99-9.6.aarch64.rpm"
RPM_HASH = "d52ad6463415f8414c389f2a19c2a9bad6eee738469fa879079b946f7749f2837a65b45f5fdd88c49a46e69d17f1757cb1829886b27a61b25f9e8d74722ee398"

RPROVIDES:${PN} += "barcode \
barcode(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
