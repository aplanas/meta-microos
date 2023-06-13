SUMMARY = "Documentation for texlive-pas-cours"
DESCRIPTION = "This package includes the documentation for texlive-pas-cours"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn55859"

RPM_NAME = "texlive-pas-cours-doc-2023.201.1.9svn55859-51.1.noarch.rpm"
RPM_HASH = "6f58da2aeed7260d1246ea043cabac08ad22d936e45e14bf10b28fe0fa51101568dbf72d338ef11f2b67ada537a2f23a0c13c6706bac0d7841c15dc2f3de393f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pas-cours-doc"

RDEPENDS:${PN} += ""

inherit rpm
