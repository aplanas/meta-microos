SUMMARY = "Documentation for texlive-xcolor-material"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-material"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-doc-2023.209.0.0.1svn42289-53.2.noarch.rpm"
RPM_HASH = "f486d4798beb43f3cc0fbc012ad7b4bf4734338710ca91e4070dfceda2ebb6a231c42ba102f3d479c1c6880246ca3ab33a1993ddb82384c9bbbfdc47fab9d097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-material-doc"

RDEPENDS:${PN} += ""

inherit rpm
