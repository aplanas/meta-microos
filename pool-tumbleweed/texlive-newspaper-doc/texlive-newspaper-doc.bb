SUMMARY = "Documentation for texlive-newspaper"
DESCRIPTION = "This package includes the documentation for texlive-newspaper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-newspaper-doc-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "a525b401d04971129b2af2c912ea9e4f2e8b9bf5a36508b161563af940beb6b7abdff9e7701d37e97711a626d26b5fd748242e05cd370493187407229744c96d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newspaper-doc"
RDEPENDS:${PN} += ""

inherit rpm
