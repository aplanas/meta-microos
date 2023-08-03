SUMMARY = "Documentation for texlive-algpseudocodex"
DESCRIPTION = "This package includes the documentation for texlive-algpseudocodex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn65860"

RPM_NAME = "texlive-algpseudocodex-doc-2023.209.1.1.0svn65860-55.1.noarch.rpm"
RPM_HASH = "e061a2d04ff533789279dca6f066cc9a0b4b0782bb86066dd9ba1b8f909193d72afae7d20b9302b5b72966d20e6f1387b459343a7f41fcd8517ad856b5d7a6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algpseudocodex-doc"

RDEPENDS:${PN} += ""

inherit rpm
