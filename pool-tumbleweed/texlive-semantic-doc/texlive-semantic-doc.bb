SUMMARY = "Documentation for texlive-semantic"
DESCRIPTION = "This package includes the documentation for texlive-semantic"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-semantic-doc-2023.209.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "13b5dced7c08e93ac6f7a83fd30e22bfd0e2838fc3df38c4bc5ac057de5fcb25fbaa51390661288c2b8a461b54cc505c958f44a77afb501631eb60dc3b691dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantic-doc"

RDEPENDS:${PN} += ""

inherit rpm
