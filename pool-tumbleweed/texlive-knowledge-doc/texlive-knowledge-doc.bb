SUMMARY = "Documentation for texlive-knowledge"
DESCRIPTION = "This package includes the documentation for texlive-knowledge"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.28svn61991"

RPM_NAME = "texlive-knowledge-doc-2023.201.1.28svn61991-55.1.noarch.rpm"
RPM_HASH = "542de9679a11e8f771f895d7202a0743f92837138d0450b562911a919827e6879202aadd45d1905af7f1e18d49cb127feba41b8342aa618784aa9d38166f1662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knowledge-doc"
RDEPENDS:${PN} += ""

inherit rpm
