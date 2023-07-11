SUMMARY = "Documentation for texlive-ziffer"
DESCRIPTION = "This package includes the documentation for texlive-ziffer"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn32279"

RPM_NAME = "texlive-ziffer-doc-2023.201.2.1svn32279-52.2.noarch.rpm"
RPM_HASH = "a771d03fa7b5122883e0e3533f2b5ea824a96e27f48df5dcfdbe2d38f75413c4f70a612af3ad7d8f69e24af62ea95756d2027e04e3b206d598ffd5685c563246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ziffer-doc"

RDEPENDS:${PN} += ""

inherit rpm
