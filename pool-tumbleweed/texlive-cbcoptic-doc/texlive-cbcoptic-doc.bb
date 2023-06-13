SUMMARY = "Documentation for texlive-cbcoptic"
DESCRIPTION = "This package includes the documentation for texlive-cbcoptic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn16666"

RPM_NAME = "texlive-cbcoptic-doc-2023.201.0.0.2svn16666-52.1.noarch.rpm"
RPM_HASH = "3c3df60be6b9c0c753d918d03fba00ecc8aba6f85582a5ac094d6c1e40f790eda5dbdac32cad33c6ef7918e61b5271bac0bb748f2fd5d08f75a698bdb77444d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbcoptic-doc"

RDEPENDS:${PN} += ""

inherit rpm
