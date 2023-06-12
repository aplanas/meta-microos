SUMMARY = "Documentation for texlive-mathpunctspace"
DESCRIPTION = "This package includes the documentation for texlive-mathpunctspace"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.1svn46754"

RPM_NAME = "texlive-mathpunctspace-doc-2023.201.1.1svn46754-52.1.noarch.rpm"
RPM_HASH = "eb6e3c12f28fbc1034223edd497b5329308098dd41d9aba00a29bde3888e4af772b45c3f94a7b1557d3b5d37e4b4f8301b870ea07104170e0a1e8a471a6e8fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpunctspace-doc"
RDEPENDS:${PN} += ""

inherit rpm
