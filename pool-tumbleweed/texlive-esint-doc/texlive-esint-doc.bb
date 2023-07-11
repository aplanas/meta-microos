SUMMARY = "Documentation for texlive-esint"
DESCRIPTION = "This package includes the documentation for texlive-esint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2dsvn52240"

RPM_NAME = "texlive-esint-doc-2023.201.1.2dsvn52240-53.2.noarch.rpm"
RPM_HASH = "9226e7d6f8e095911114ed85c36dde1915e9090680d25ae4436ecaee819cae9eab49550d68d8e553115ef7e396a2fff2773970c155397ec468c0e1a6e3f69f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-doc"

RDEPENDS:${PN} += ""

inherit rpm
