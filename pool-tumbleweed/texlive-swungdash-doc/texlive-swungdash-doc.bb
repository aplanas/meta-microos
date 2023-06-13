SUMMARY = "Documentation for texlive-swungdash"
DESCRIPTION = "This package includes the documentation for texlive-swungdash"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn64204"

RPM_NAME = "texlive-swungdash-doc-2023.201.1.0.0svn64204-57.1.noarch.rpm"
RPM_HASH = "055be99325197847d4653efaf4a28bb68853c1951ae8ae30dd8681d42dc4add0c22d7fe06fae1bb8572c1d56dedbae2365fbf78db76b7cd22590ff646c4022a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swungdash-doc"

RDEPENDS:${PN} += ""

inherit rpm
