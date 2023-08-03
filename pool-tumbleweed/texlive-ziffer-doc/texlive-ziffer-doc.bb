SUMMARY = "Documentation for texlive-ziffer"
DESCRIPTION = "This package includes the documentation for texlive-ziffer"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn32279"

RPM_NAME = "texlive-ziffer-doc-2023.209.2.1svn32279-53.1.noarch.rpm"
RPM_HASH = "3398dc4112381840520970db342f097b714e1e372399fd718baebf0055416932c5fba70bd0e4c1587169fa22b46646028655ecd6fcca22affbfff07162d17e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ziffer-doc"

RDEPENDS:${PN} += ""

inherit rpm
