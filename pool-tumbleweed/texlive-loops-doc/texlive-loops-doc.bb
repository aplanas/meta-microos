SUMMARY = "Documentation for texlive-loops"
DESCRIPTION = "This package includes the documentation for texlive-loops"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn30704"

RPM_NAME = "texlive-loops-doc-2023.209.1.3svn30704-55.1.noarch.rpm"
RPM_HASH = "a7022fe9eb884a4c2bf367f969e4fd2d9285429d785d799556a7e40fd768abacfce3771846067e4db5b9f61830bbe372a25cf9d24b8960e3cf465b2cb99d7956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-loops-doc"

RDEPENDS:${PN} += ""

inherit rpm
