SUMMARY = "Documentation for texlive-opensans"
DESCRIPTION = "This package includes the documentation for texlive-opensans"
LICENSE = "Apache-1.0"

PV = "2023.201.2.2svn54512"

RPM_NAME = "texlive-opensans-doc-2023.201.2.2svn54512-54.1.noarch.rpm"
RPM_HASH = "1b8f2b458fcb53f720ecf15e329a4ebb33a08d9be481a902bf25952b6c8d784fe266e944b9b02887b9d97fa259f1dff4b38ad00081df5ef367c87c4b7bd2fba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opensans-doc"

RDEPENDS:${PN} += ""

inherit rpm
