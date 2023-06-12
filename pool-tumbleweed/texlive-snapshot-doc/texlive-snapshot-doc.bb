SUMMARY = "Documentation for texlive-snapshot"
DESCRIPTION = "This package includes the documentation for texlive-snapshot"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn56735"

RPM_NAME = "texlive-snapshot-doc-2023.201.2.14svn56735-57.1.noarch.rpm"
RPM_HASH = "3fb524ed938785342b44f394bb24c3dcab09f2e66762ab9baf847e29dd9cb33ec88425a09166467625c0e499830914c0a4b882fc134bc422815ad3c2ca33cb34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snapshot-doc"
RDEPENDS:${PN} += ""

inherit rpm
