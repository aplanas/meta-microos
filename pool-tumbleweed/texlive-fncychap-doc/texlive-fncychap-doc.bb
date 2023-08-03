SUMMARY = "Documentation for texlive-fncychap"
DESCRIPTION = "This package includes the documentation for texlive-fncychap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn20710"

RPM_NAME = "texlive-fncychap-doc-2023.209.1.34svn20710-53.1.noarch.rpm"
RPM_HASH = "d3b3372c8471c031c53c104411e2b26928a4e800f72520133200a714757c327233245d742860212c9a7457d6e6df139210665c75c2140676516db34eb8a9887c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fncychap-doc"

RDEPENDS:${PN} += ""

inherit rpm
