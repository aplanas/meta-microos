SUMMARY = "Documentation for texlive-swungdash"
DESCRIPTION = "This package includes the documentation for texlive-swungdash"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn64204"

RPM_NAME = "texlive-swungdash-doc-2023.209.1.0.0svn64204-58.1.noarch.rpm"
RPM_HASH = "e2235fe1229621fbcbf8cc07475d6d475ac7f38b3421e404fe7a9375893392e1d61baf5c90ec96e5347190cdb373c00aa3b9d4715e254bf8d43cbd294fc68dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swungdash-doc"

RDEPENDS:${PN} += ""

inherit rpm
