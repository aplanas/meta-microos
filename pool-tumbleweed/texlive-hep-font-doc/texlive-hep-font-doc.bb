SUMMARY = "Documentation for texlive-hep-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-font"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64900"

RPM_NAME = "texlive-hep-font-doc-2023.201.1.1svn64900-53.1.noarch.rpm"
RPM_HASH = "2ca2cae775997a0bef71445ab9753cff2a368c069fa957832ce89286c7c801ce6f69f1de2a9c2ac446d174c2ba5751060cbf58f797707311a8558bb0226a3936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
