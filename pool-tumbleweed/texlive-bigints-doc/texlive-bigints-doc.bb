SUMMARY = "Documentation for texlive-bigints"
DESCRIPTION = "This package includes the documentation for texlive-bigints"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29803"

RPM_NAME = "texlive-bigints-doc-2023.201.svn29803-53.1.noarch.rpm"
RPM_HASH = "5faa40a83732d538a6027cd62dfaaec92cc820ca1db228517ca6d853572547b9926ecea7d6cedebaa19de81f708f721da6e37bc89c4bcfbdb794fbc4e141f15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigints-doc"

RDEPENDS:${PN} += ""

inherit rpm
