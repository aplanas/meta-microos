SUMMARY = "Documentation for texlive-polytable"
DESCRIPTION = "This package includes the documentation for texlive-polytable"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.6svn55837"

RPM_NAME = "texlive-polytable-doc-2023.201.0.0.8.6svn55837-52.1.noarch.rpm"
RPM_HASH = "87df80d8cf6dd7d4f21151c50dbafab8c0264634b5d169857c6cc7a953ad0c0d4078041c4ae1a7bc8a7c24b68c290d2a1ad3b66315f2c49b2614d1ea92f7e0de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polytable-doc"
RDEPENDS:${PN} += ""

inherit rpm
