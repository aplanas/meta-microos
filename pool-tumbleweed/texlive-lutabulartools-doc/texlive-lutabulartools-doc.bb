SUMMARY = "Documentation for texlive-lutabulartools"
DESCRIPTION = "This package includes the documentation for texlive-lutabulartools"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65153"

RPM_NAME = "texlive-lutabulartools-doc-2023.208.svn65153-53.1.noarch.rpm"
RPM_HASH = "ece5a3b3d1b74bb710a7603dc28023d09d139dc01687ed1c80410571644070c8639a457a13fc74a238684e9c8945c1e8e5555db53a9c134b9ea15340ab6be13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lutabulartools-doc"

RDEPENDS:${PN} += ""

inherit rpm
