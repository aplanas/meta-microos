SUMMARY = "Documentation for texlive-makebox"
DESCRIPTION = "This package includes the documentation for texlive-makebox"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn15878"

RPM_NAME = "texlive-makebox-doc-2023.208.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "3b9d730637c5eb8a34c18b8f727a343759581b70cd16b3f769e5d8a982d805c18aa85d5462d38edcf518a39eb9af55f0fa998895bd15fc88fbdc67b3acbd759d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
