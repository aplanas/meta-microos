SUMMARY = "Documentation for texlive-dejavu"
DESCRIPTION = "This package includes the documentation for texlive-dejavu"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.34svn31771"

RPM_NAME = "texlive-dejavu-doc-2023.201.2.34svn31771-52.1.noarch.rpm"
RPM_HASH = "80ef2138bb761cb070c96f7fdfb0613b8b3fc4541de5468dafcc93e12023218480fa63f55346660554d1a240905155f87e2dc951c6117c5c5298676d2b5c38eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dejavu-doc"

RDEPENDS:${PN} += ""

inherit rpm
