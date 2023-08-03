SUMMARY = "Documentation for texlive-babel-azerbaijani"
DESCRIPTION = "This package includes the documentation for texlive-babel-azerbaijani"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn44197"

RPM_NAME = "texlive-babel-azerbaijani-doc-2023.209.1.0asvn44197-54.1.noarch.rpm"
RPM_HASH = "e44c8038f3e47556da0a4d180d1a6870a864601cce870d3f7efd7ad9a2010d309fcdafcf5d6974fb925068da3b5ee0b679e7ca5d9d67d7c1c6a45a33ef5dbe5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-azerbaijani-doc"

RDEPENDS:${PN} += ""

inherit rpm
