SUMMARY = "Documentation for texlive-matrix-skeleton"
DESCRIPTION = "This package includes the documentation for texlive-matrix-skeleton"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn65013"

RPM_NAME = "texlive-matrix-skeleton-doc-2023.208.1.1svn65013-53.1.noarch.rpm"
RPM_HASH = "1ac8a54a138a675bd7c26ee804952a43ea29b13cdb7f1de841891be650745db4bad79428eeefce0c3dfb939b9f05330f1ef78a41fef1632183cd8d05fcc8bb33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-matrix-skeleton-doc"

RDEPENDS:${PN} += ""

inherit rpm
