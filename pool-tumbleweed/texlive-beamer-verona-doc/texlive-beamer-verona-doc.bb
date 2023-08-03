SUMMARY = "Documentation for texlive-beamer-verona"
DESCRIPTION = "This package includes the documentation for texlive-beamer-verona"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn39180"

RPM_NAME = "texlive-beamer-verona-doc-2023.209.0.0.2svn39180-54.1.noarch.rpm"
RPM_HASH = "b96b772cbe5aa6d6139e029574c46312884c76fb2ec6adf74b0c15787f68ba4bfbf321b8dbbd27006cfb86ede2eb70c10afd71225c705a1bf8731a9f190bccf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-verona-doc"

RDEPENDS:${PN} += ""

inherit rpm
