SUMMARY = "Documentation for texlive-emptypage"
DESCRIPTION = "This package includes the documentation for texlive-emptypage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18064"

RPM_NAME = "texlive-emptypage-doc-2023.201.1.2svn18064-53.2.noarch.rpm"
RPM_HASH = "dcf3299a4bafc40eebbc21fe2bdf4b23fda7ceb858b22cc2b1a04597b6691562cb3131870a97a0ee748ea91320135befaf71e5c06abba76f345cf31ea948b27a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emptypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
