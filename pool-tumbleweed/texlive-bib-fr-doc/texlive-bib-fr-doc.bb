SUMMARY = "Documentation for texlive-bib-fr"
DESCRIPTION = "This package includes the documentation for texlive-bib-fr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-bib-fr-doc-2023.201.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "d12d8bd17e7fecb34c6df8fbcf5fc8d85c8fa904e2623afe73d7ec11203167677794416f752c6995a4b09d79f795bdb79f79bb8bfeeb90c8189e31b23ecd16a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bib-fr-doc"
RDEPENDS:${PN} += ""

inherit rpm
