SUMMARY = "Documentation for texlive-beamerposter"
DESCRIPTION = "This package includes the documentation for texlive-beamerposter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.13svn54512"

RPM_NAME = "texlive-beamerposter-doc-2023.209.1.13svn54512-54.1.noarch.rpm"
RPM_HASH = "7301f7d47ccd058bc144fd1342c4dbcd0f7472435e13d10ecfd3c43f712394f3599196994269ce7474212891558c4fb903da8c7721914da688bddd767b225db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
