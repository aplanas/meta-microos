SUMMARY = "Documentation for texlive-latex-tools-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-tools-dev"
LICENSE = "LPPL-1.0"

PV = "2023.201.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-tools-dev-doc-2023.201.20230501_pre_release_0svn64899-55.1.noarch.rpm"
RPM_HASH = "d4b8a3e3b3af572ea8c38f261602b0d5a9a249a51ba09653b4bbc23bfcf1cc5202a607449e00d01db70fa964d3dd2dabe1cc1028321f7f38cce605ca4608a1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-tools-dev-doc"
RDEPENDS:${PN} += ""

inherit rpm
