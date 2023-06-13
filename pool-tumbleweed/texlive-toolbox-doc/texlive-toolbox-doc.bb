SUMMARY = "Documentation for texlive-toolbox"
DESCRIPTION = "This package includes the documentation for texlive-toolbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.1svn32260"

RPM_NAME = "texlive-toolbox-doc-2023.201.5.1svn32260-52.1.noarch.rpm"
RPM_HASH = "6af27343d95d8055814d37898bd6568673b654767d532fc93e778c6ed8fff97d1be95963c7b56d549cdcccc57c43ed419dea6e4edb7c9b9a92c3fc08ca0b60d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-toolbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
