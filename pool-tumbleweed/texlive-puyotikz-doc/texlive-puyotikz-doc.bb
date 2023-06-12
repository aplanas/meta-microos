SUMMARY = "Documentation for texlive-puyotikz"
DESCRIPTION = "This package includes the documentation for texlive-puyotikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-doc-2023.201.1.0.1svn57254-53.1.noarch.rpm"
RPM_HASH = "5c1d3929ecd75a14d3de405d193f897f785cf8481112f4cbffb828843a111b03ff824e8f78e796ad325e99bcb766a640c0cfb6032a727b699c4ce80c86bb930c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-puyotikz-doc"
RDEPENDS:${PN} += ""

inherit rpm
