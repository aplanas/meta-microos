SUMMARY = "Documentation for texlive-loops"
DESCRIPTION = "This package includes the documentation for texlive-loops"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn30704"

RPM_NAME = "texlive-loops-doc-2023.201.1.3svn30704-54.1.noarch.rpm"
RPM_HASH = "429acba5f4751ccdbdc25a8f56f048f18f3917aa916c9e2e9552df43ed81b27e2671cc9073d2cedb60ca1c689de55e682cbb3d71b2a6166e2e41e1200e41e33c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-loops-doc"

RDEPENDS:${PN} += ""

inherit rpm
