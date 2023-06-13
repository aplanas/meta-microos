SUMMARY = "Documentation for texlive-ziffer"
DESCRIPTION = "This package includes the documentation for texlive-ziffer"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn32279"

RPM_NAME = "texlive-ziffer-doc-2023.201.2.1svn32279-52.1.noarch.rpm"
RPM_HASH = "62d25e887ae70decfe8b97d98a493ea34af62ea0314a693e21926135dc16d06011fa1832de06af02be3518a1451f5ce18d6b9d256a32b7493865c46e531917fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ziffer-doc"

RDEPENDS:${PN} += ""

inherit rpm
