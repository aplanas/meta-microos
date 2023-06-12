SUMMARY = "Documentation for texlive-babel-czech"
DESCRIPTION = "This package includes the documentation for texlive-babel-czech"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1asvn30261"

RPM_NAME = "texlive-babel-czech-doc-2023.201.3.1asvn30261-53.1.noarch.rpm"
RPM_HASH = "5ac892b3c3c16ac54697326bf8dbb4b45e252e5a4661ede83fc63e2eb0f9f939f329a894a47016ed81a68da93f09c6be2628ca4a43441df930220011af65cdcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-czech-doc"
RDEPENDS:${PN} += ""

inherit rpm
