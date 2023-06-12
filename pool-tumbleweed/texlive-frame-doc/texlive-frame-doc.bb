SUMMARY = "Documentation for texlive-frame"
DESCRIPTION = "This package includes the documentation for texlive-frame"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn18312"

RPM_NAME = "texlive-frame-doc-2023.201.1.0svn18312-52.1.noarch.rpm"
RPM_HASH = "cbc2121dbf4b2094529452a7f04a7ae8847c6edc92254117554c89445b716688f8e1d1b3cdcc97125c69ae82a995090d91e5f7667611e1b8ccf9059e9b66a008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frame-doc"
RDEPENDS:${PN} += ""

inherit rpm
