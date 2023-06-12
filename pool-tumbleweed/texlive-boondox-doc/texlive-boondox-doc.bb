SUMMARY = "Documentation for texlive-boondox"
DESCRIPTION = "This package includes the documentation for texlive-boondox"
LICENSE = "OFL-1.1"

PV = "2023.201.1.02dsvn54512"

RPM_NAME = "texlive-boondox-doc-2023.201.1.02dsvn54512-52.1.noarch.rpm"
RPM_HASH = "a41d9ac04a215f98d126b72bdc714b8818ad5b900ac5644d556b53d4a04e5f30aaaedce384c6b2992d595d34b8034f583987ccafe826b2b20c7eadac0bd3763d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boondox-doc"
RDEPENDS:${PN} += ""

inherit rpm
