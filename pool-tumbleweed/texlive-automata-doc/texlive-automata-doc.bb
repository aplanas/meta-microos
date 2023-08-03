SUMMARY = "Documentation for texlive-automata"
DESCRIPTION = "This package includes the documentation for texlive-automata"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn19717"

RPM_NAME = "texlive-automata-doc-2023.209.0.0.3svn19717-54.1.noarch.rpm"
RPM_HASH = "c30f07619de82acd254f958323bd1c848369455f3ea8372f61f94ab4e213b904a5a8451bda2bafdf891fd9786d43268d10ab7fefd6974686781f078e85a56da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-automata-doc"

RDEPENDS:${PN} += ""

inherit rpm
