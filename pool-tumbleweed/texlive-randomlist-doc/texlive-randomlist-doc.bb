SUMMARY = "Documentation for texlive-randomlist"
DESCRIPTION = "This package includes the documentation for texlive-randomlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn45281"

RPM_NAME = "texlive-randomlist-doc-2023.201.1.3svn45281-53.2.noarch.rpm"
RPM_HASH = "69c5e891e18e6163fe363bd36313d52963ed09e10371536aea03c88affe72ce101f7ffc310cd8891b9c23ffcaa8c0f0e94747ab366ca3ab0801bb9e98bedac51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
