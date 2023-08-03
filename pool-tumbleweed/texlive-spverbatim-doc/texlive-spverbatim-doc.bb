SUMMARY = "Documentation for texlive-spverbatim"
DESCRIPTION = "This package includes the documentation for texlive-spverbatim"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-spverbatim-doc-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "c3c94ce83feca17367067033d728719dcb7223d9afbafa5670c43c21cda9ac8848a2555ab2aab2dd0ecb02e6fc74266bfa6b1ef1385ffeb9dcf63e5678748e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spverbatim-doc"

RDEPENDS:${PN} += ""

inherit rpm
