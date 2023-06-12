SUMMARY = "Documentation for texlive-listliketab"
DESCRIPTION = "This package includes the documentation for texlive-listliketab"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-listliketab-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "31f09169fe4996e0b7d8d23efb266395ea9d24e7e31975bf352c7969f97a362a48938ece3eb3838ae90d718536653bdc286e402fec3b5d9dfc62d295400dd0a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listliketab-doc"
RDEPENDS:${PN} += ""

inherit rpm
