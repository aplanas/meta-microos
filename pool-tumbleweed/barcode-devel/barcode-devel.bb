SUMMARY = "Text-Mode Barcode Creation Utility - Development files"
DESCRIPTION = "GNU Barcode is meant to meet most barcode creation needs with a \
conventional printer. It can create printouts for the conventional \
product tagging standards: UPC-A, UPC-E, EAN-13, EAN-8, ISBN, as well \
as a few other formats. Output is generated in either PostScript or \
Encapsulated PostScript format."
LICENSE = "GPL-3.0-or-later"

PV = "0.99"

RPM_NAME = "barcode-devel-0.99-9.7.aarch64.rpm"
RPM_HASH = "01d97a6229ce8c8e6a9648ae24c711be1647cfc2b3d222fd290383f3c2d5eef35a358ee39d22cd951a14d3cb41266de642128b6c4f5f5622e2f8ac3ee7b30a6f"

RPROVIDES:${PN} += "barcode-devel"

RDEPENDS:${PN} += ""

inherit rpm
