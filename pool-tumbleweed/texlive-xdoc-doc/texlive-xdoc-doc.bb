SUMMARY = "Documentation for texlive-xdoc"
DESCRIPTION = "This package includes the documentation for texlive-xdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.prot2.5svn15878"

RPM_NAME = "texlive-xdoc-doc-2023.209.prot2.5svn15878-53.2.noarch.rpm"
RPM_HASH = "1674fc9a23659d66fc76170ffacd9144342f3d7e0ded4c645ac0742c1f6a45a5aafe96dc93b6612d25e4437317fa9e9e8f1ff40b7933e7f34793e202dcab33b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
