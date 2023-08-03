SUMMARY = "Documentation for texlive-asapsym"
DESCRIPTION = "This package includes the documentation for texlive-asapsym"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn40201"

RPM_NAME = "texlive-asapsym-doc-2023.209.1.0svn40201-54.1.noarch.rpm"
RPM_HASH = "0f42000ac3a4cbb4819139b19e2e323a15fbeaac489acab2e70ebb3ec345f14c4228696f8a6d20916248f9c8373a1dc32959ce23fa863795a46a1da85ab1feda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asapsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
