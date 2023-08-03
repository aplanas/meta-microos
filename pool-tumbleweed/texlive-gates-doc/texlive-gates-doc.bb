SUMMARY = "Documentation for texlive-gates"
DESCRIPTION = "This package includes the documentation for texlive-gates"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn29803"

RPM_NAME = "texlive-gates-doc-2023.209.0.0.2svn29803-53.1.noarch.rpm"
RPM_HASH = "33110a77ca9f725c5b5110ec4048bbc2abf266dfc44db5a2db5903c4854f9db2c858203ce7e572a03a2f5e96712c176953ed25ac7db299295735db5a00b26294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gates-doc"

RDEPENDS:${PN} += ""

inherit rpm
