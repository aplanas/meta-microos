SUMMARY = "Documentation for texlive-endheads"
DESCRIPTION = "This package includes the documentation for texlive-endheads"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn43750"

RPM_NAME = "texlive-endheads-doc-2023.209.1.6svn43750-54.1.noarch.rpm"
RPM_HASH = "8b584c6eebeb229db3399b39bd94f2fd9f729fae68fe6aa096162f3614ddf7581cfe17b21bb18abb3b09226799d86fd0f30624758f21ac12a3ba05512d9723ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endheads-doc"

RDEPENDS:${PN} += ""

inherit rpm
