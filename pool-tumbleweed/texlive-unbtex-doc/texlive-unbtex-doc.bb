SUMMARY = "Documentation for texlive-unbtex"
DESCRIPTION = "This package includes the documentation for texlive-unbtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64634"

RPM_NAME = "texlive-unbtex-doc-2023.209.1.2svn64634-54.1.noarch.rpm"
RPM_HASH = "7e7513bd8cfbae42555af73f00a3787d12307352d555e4574d5c55bf02f259af2d28520bc39b3a753eed58a5f7c1da79767dfe789b6d514d0c73600148fb322f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-unbtex-doc-pt-BR \
texlive-unbtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
