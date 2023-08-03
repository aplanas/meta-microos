SUMMARY = "Documentation for texlive-hershey-mp"
DESCRIPTION = "This package includes the documentation for texlive-hershey-mp"
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_1.0svn64878"

RPM_NAME = "texlive-hershey-mp-doc-2023.209.2022_1.0svn64878-54.1.noarch.rpm"
RPM_HASH = "8ed81264887073c12a62143616c31f0a3ac3af3bd101c387f30510027904f6ef570543dad57c780a06e8759f2d224d71a6310e4a95566a6c6004e8e07842c247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hershey-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
