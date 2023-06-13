SUMMARY = "Documentation for texlive-table-fct"
DESCRIPTION = "This package includes the documentation for texlive-table-fct"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn41849"

RPM_NAME = "texlive-table-fct-doc-2023.201.1.1svn41849-57.1.noarch.rpm"
RPM_HASH = "3dc5437c7911a6d03b2fb7f7e7ed7d0b4d7be77279bd5e9157893883ea8e7be3a3e2042d5e4f5dbd7053824f2d43e8e700d1934b3ec66ea692bc4afdd2c44114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-table-fct-doc"

RDEPENDS:${PN} += ""

inherit rpm
