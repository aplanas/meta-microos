SUMMARY = "Documentation for texlive-subfigure"
DESCRIPTION = "This package includes the documentation for texlive-subfigure"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.5svn15878"

RPM_NAME = "texlive-subfigure-doc-2023.201.2.1.5svn15878-57.1.noarch.rpm"
RPM_HASH = "88267f823fe92405acbdffd5a457c407fe05288c39581660ac2ab2753bc162e4a0c620ef42c732f3ba861dd1cc0adf08f8ad2242befc9a0d2efc3f3466523a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfigure-doc"
RDEPENDS:${PN} += ""

inherit rpm
