SUMMARY = "Documentation for texlive-xnewcommand"
DESCRIPTION = "This package includes the documentation for texlive-xnewcommand"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-doc-2023.209.1.2svn15878-53.2.noarch.rpm"
RPM_HASH = "a761eb2d44ce4e7db9cb74b8fdd1d32433587c6925e4bbe5014b109d4ac0191af1e342ee801ca88307031f97f83612d3ee09e6bc7320de3bc1632f1e6a42bf92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xnewcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
