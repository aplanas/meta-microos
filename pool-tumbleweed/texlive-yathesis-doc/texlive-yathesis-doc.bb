SUMMARY = "Documentation for texlive-yathesis"
DESCRIPTION = "This package includes the documentation for texlive-yathesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.11svn66146"

RPM_NAME = "texlive-yathesis-doc-2023.209.1.0.11svn66146-53.1.noarch.rpm"
RPM_HASH = "08a99e05a452826a9ac16e017ed8e2d582f8ceb8c46bbc7be2be067cfbd6a4554c5ebc3c956366cd6689bb062b0111541406e27128df3bac8eb3ec25fd371780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yathesis-doc-fr \
texlive-yathesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
