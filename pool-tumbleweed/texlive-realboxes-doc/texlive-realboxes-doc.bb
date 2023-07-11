SUMMARY = "Documentation for texlive-realboxes"
DESCRIPTION = "This package includes the documentation for texlive-realboxes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn64967"

RPM_NAME = "texlive-realboxes-doc-2023.201.0.0.2svn64967-53.2.noarch.rpm"
RPM_HASH = "7312c65bc4d4c24ef6956d7ac4e34b22c99216bd1d67b75ea5b354c58f6dd7a42c5478fc54e385a22ca03bf825f689b16d15a060b8c4fed8fb21b1b2ed0d16f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realboxes-doc"

RDEPENDS:${PN} += ""

inherit rpm
