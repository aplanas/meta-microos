SUMMARY = "Documentation for texlive-biblatex-german-legal"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-german-legal"
LICENSE = "LPPL-1.0"

PV = "2023.209.003svn66461"

RPM_NAME = "texlive-biblatex-german-legal-doc-2023.209.003svn66461-54.1.noarch.rpm"
RPM_HASH = "86e1636eae7e22248c391cfad997967727485238d2f173585091d34f8d7c573edce7cdc78b23f2e83dcd294d250149f56c24ea756a93c15cd233c2524f14b2ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-german-legal-doc-de \
texlive-biblatex-german-legal-doc"

RDEPENDS:${PN} += ""

inherit rpm
