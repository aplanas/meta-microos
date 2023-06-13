SUMMARY = "Documentation for texlive-automata"
DESCRIPTION = "This package includes the documentation for texlive-automata"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn19717"

RPM_NAME = "texlive-automata-doc-2023.201.0.0.3svn19717-53.1.noarch.rpm"
RPM_HASH = "959eda7c6a4441dfab2ab1ebdd94f01819c3ed6fcce80da17ddb6fbcbdf3d8e308fc17119d79640fb272293f1542bc10486a4e922c3959246a3502c1d451397c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-automata-doc"

RDEPENDS:${PN} += ""

inherit rpm
