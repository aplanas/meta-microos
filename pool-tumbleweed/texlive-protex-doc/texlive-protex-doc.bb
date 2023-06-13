SUMMARY = "Documentation for texlive-protex"
DESCRIPTION = "This package includes the documentation for texlive-protex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn41633"

RPM_NAME = "texlive-protex-doc-2023.201.svn41633-52.1.noarch.rpm"
RPM_HASH = "6cdf797190b98a8c055a4c623b52a828c89082158fd731c3c05fe883a697af4cc7ea771bba3f7039bac314d78596b57a757eaa61b172f103e22fd9eebd14b3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-protex-doc"

RDEPENDS:${PN} += ""

inherit rpm
