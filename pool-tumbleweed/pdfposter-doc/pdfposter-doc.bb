SUMMARY = "Documentation files for pdfposter"
DESCRIPTION = "HTML Documentation and examples for pdfposter."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "pdfposter-doc-0.8.1-1.2.noarch.rpm"
RPM_HASH = "3f95fc1ed2073819d1239122a1753904155aa9382ce8a40e4b9aac4d38536685031a28722e62f02b016f1f235e97b02c30e908e57209ee26221b395acf890401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
