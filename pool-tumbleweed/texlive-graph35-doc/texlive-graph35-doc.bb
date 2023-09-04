SUMMARY = "Documentation for texlive-graph35"
DESCRIPTION = "This package includes the documentation for texlive-graph35"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn65138"

RPM_NAME = "texlive-graph35-doc-2023.209.0.0.1.3svn65138-54.2.noarch.rpm"
RPM_HASH = "9146b5115c3a56bac0f51c0a60523855a78c2f4d0d6060ef94d127b6f2fc32e841fabb6260647d88a1304a5b26493aff077fef1e1f4cf510d637661b5843ccb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-graph35-doc-fr \
texlive-graph35-doc"

RDEPENDS:${PN} += ""

inherit rpm
