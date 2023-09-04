SUMMARY = "Documentation for texlive-hfbright"
DESCRIPTION = "This package includes the documentation for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-hfbright-doc-2023.209.svn29349-54.2.noarch.rpm"
RPM_HASH = "d6721f5837b5280aec6bdd77a4b781edc1e31f078456d384d0c96a444a16d314011974a5cf24a56bfe23ddf823c052331cc334b2935dbeba1b4ff5c1742ee21d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfbright-doc"

RDEPENDS:${PN} += ""

inherit rpm
