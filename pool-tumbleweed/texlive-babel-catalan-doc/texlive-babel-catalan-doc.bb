SUMMARY = "Documentation for texlive-babel-catalan"
DESCRIPTION = "This package includes the documentation for texlive-babel-catalan"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2psvn30259"

RPM_NAME = "texlive-babel-catalan-doc-2023.209.2.2psvn30259-54.1.noarch.rpm"
RPM_HASH = "f204165bdd566c29293c331ce9c884fb29194ea190882c4cbb42462c17bd8cfcb3d527e8fc178a7ce4802681af68718935b1502655e1d70b6c22a330422ed69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-catalan-doc"

RDEPENDS:${PN} += ""

inherit rpm
