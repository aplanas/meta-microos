SUMMARY = "Documentation for texlive-feynmp-auto"
DESCRIPTION = "This package includes the documentation for texlive-feynmp-auto"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn30223"

RPM_NAME = "texlive-feynmp-auto-doc-2023.209.1.1svn30223-53.1.noarch.rpm"
RPM_HASH = "389c1e0344fc4a3bf65e57a61e04feca010d0e3f3a668ef9c3a28bfc33bea4c073bd45f9cf876ec8c3239419ff3a7e302ba4bab55c0266e14ecb81cc280baf83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feynmp-auto-doc"

RDEPENDS:${PN} += ""

inherit rpm
