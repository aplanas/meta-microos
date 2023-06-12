SUMMARY = "Documentation for texlive-collcell"
DESCRIPTION = "This package includes the documentation for texlive-collcell"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn64967"

RPM_NAME = "texlive-collcell-doc-2023.201.0.0.5svn64967-53.1.noarch.rpm"
RPM_HASH = "ce604f588637fb6ee265c9fec14afb35fabb00242f6504421cdac329db0bcdacce13e8d41c2622794a434e18fae395e4b253a944499e22559a09acf59539063c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collcell-doc"
RDEPENDS:${PN} += ""

inherit rpm
