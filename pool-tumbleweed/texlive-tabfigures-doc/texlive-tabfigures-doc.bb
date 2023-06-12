SUMMARY = "Documentation for texlive-tabfigures"
DESCRIPTION = "This package includes the documentation for texlive-tabfigures"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn25202"

RPM_NAME = "texlive-tabfigures-doc-2023.201.1.1svn25202-57.1.noarch.rpm"
RPM_HASH = "cf4031a4077970a67f9f4bf1c0ca4c297f8354d7c2ef604c0eef4ff44329942d90bcac8d65da4cb11878d3acf7848c9e4a2d6e261969f4e26df409f81ca693a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabfigures-doc"
RDEPENDS:${PN} += ""

inherit rpm
