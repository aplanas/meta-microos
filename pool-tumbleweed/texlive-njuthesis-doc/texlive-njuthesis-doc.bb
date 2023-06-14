SUMMARY = "Documentation for texlive-njuthesis"
DESCRIPTION = "This package includes the documentation for texlive-njuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn65546"

RPM_NAME = "texlive-njuthesis-doc-2023.201.1.1.2svn65546-54.1.noarch.rpm"
RPM_HASH = "5dbac76d4c5fa1fa693da89fa662139095386f507c487bc64d920ffb0c8f9437f7b02cb4af2883bf86389f0d7901caa8b929e11b6a806058d5d557bc2efe7d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-njuthesis-doc-zh \
texlive-njuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
