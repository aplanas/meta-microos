SUMMARY = "Documentation for texlive-pstricks-add"
DESCRIPTION = "This package includes the documentation for texlive-pstricks-add"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.93svn65067"

RPM_NAME = "texlive-pstricks-add-doc-2023.201.3.93svn65067-53.1.noarch.rpm"
RPM_HASH = "cf8a246587396178235c2341c4078f7040df72492c7b8858a186ae83b4ccf807248a2b7336407675f22efb7a3ebf97d65cc531de77a0ce249e2a6b3b57c5d34c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-add-doc"
RDEPENDS:${PN} += ""

inherit rpm
