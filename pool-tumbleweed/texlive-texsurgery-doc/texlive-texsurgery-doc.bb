SUMMARY = "Documentation for texlive-texsurgery"
DESCRIPTION = "This package includes the documentation for texlive-texsurgery"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.6.0svn59885"

RPM_NAME = "texlive-texsurgery-doc-2023.209.0.0.6.0svn59885-55.1.noarch.rpm"
RPM_HASH = "91852a85b212442827aa51e9688d7a056463a2bce52b3bf50b3b13151aaadf29bb2bf458e9c5afb3b16d4fea7cfe5b499eb5dfdea3faed9bf64c4eda9fc5618b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texsurgery-doc"

RDEPENDS:${PN} += ""

inherit rpm
