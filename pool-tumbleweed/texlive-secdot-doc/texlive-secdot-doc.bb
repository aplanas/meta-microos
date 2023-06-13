SUMMARY = "Documentation for texlive-secdot"
DESCRIPTION = "This package includes the documentation for texlive-secdot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20208"

RPM_NAME = "texlive-secdot-doc-2023.201.1.0svn20208-53.1.noarch.rpm"
RPM_HASH = "fc248ac4d45e9533aa79fadd8bf5d050d2fde090fc903497477452c9a9b81a84c9f950b712749d5f193778baf929f4006cedc409b4351090ff4c8b17ae4ece21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-secdot-doc"

RDEPENDS:${PN} += ""

inherit rpm
