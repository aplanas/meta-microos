SUMMARY = "Documentation for texlive-randbild"
DESCRIPTION = "This package includes the documentation for texlive-randbild"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-randbild-doc-2023.201.0.0.2svn15878-53.2.noarch.rpm"
RPM_HASH = "3a626e547fccdb0abbc7e50dd29cb442741d091fdfaa52667a1b034e31d5c6a11d9da413051bce404b009e0803259444044a9dbe91adec961b8d8158fdb195c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-randbild-doc-de \
texlive-randbild-doc"

RDEPENDS:${PN} += ""

inherit rpm
