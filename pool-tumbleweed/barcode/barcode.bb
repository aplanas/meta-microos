SUMMARY = "Text-Mode Barcode Creation Utility"
DESCRIPTION = "GNU Barcode is meant to meet most barcode creation needs with a \
conventional printer. It can create printouts for the conventional \
product tagging standards: UPC-A, UPC-E, EAN-13, EAN-8, ISBN, as well \
as a few other formats. Output is generated in either PostScript or \
Encapsulated PostScript format."
LICENSE = "GPL-3.0-or-later"

PV = "0.99"

RPM_NAME = "barcode-0.99-9.7.aarch64.rpm"
RPM_HASH = "8fb30bf1f84823e41dbc41508b3aa4a11489c9b94b1b7f9d6d054693dd7fc6fdc8cbb11df20e31afeddc4af159d59749f698c8210a87a788e4551ff8cf4d6ce8"

RPROVIDES:${PN} += "barcode"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
