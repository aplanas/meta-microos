SUMMARY = "Text-Mode Barcode Creation Utility - Development files"
DESCRIPTION = "GNU Barcode is meant to meet most barcode creation needs with a \
conventional printer. It can create printouts for the conventional \
product tagging standards: UPC-A, UPC-E, EAN-13, EAN-8, ISBN, as well \
as a few other formats. Output is generated in either PostScript or \
Encapsulated PostScript format."
LICENSE = "GPL-3.0-or-later"

PV = "0.99"

RPM_NAME = "barcode-devel-0.99-9.6.aarch64.rpm"
RPM_HASH = "1052a9928c1ee21a1d308213a38cf69fb8d23dc62c1453091c9c55c07efbb5e3db1f70149cc1544bfbfd276f720d5ab82237d3bef35075cac34129f8fd13ca7f"

RPROVIDES:${PN} += "barcode-devel barcode-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
