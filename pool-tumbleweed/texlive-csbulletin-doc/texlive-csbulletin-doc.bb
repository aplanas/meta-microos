SUMMARY = "Documentation for texlive-csbulletin"
DESCRIPTION = "This package includes the documentation for texlive-csbulletin"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65250"

RPM_NAME = "texlive-csbulletin-doc-2023.209.svn65250-55.1.noarch.rpm"
RPM_HASH = "620ab142e117d1bc025a4ce3a30a22c6dadfac83cc5f3611dcbf0eb3ffa4efb29436ea5166ada608b7fbce181a11857774aba6b8af01456c5ca6cdc64ee0289a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-csbulletin-doc-cs \
texlive-csbulletin-doc"

RDEPENDS:${PN} += ""

inherit rpm
