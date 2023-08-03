SUMMARY = "Documentation for texlive-shapepar"
DESCRIPTION = "This package includes the documentation for texlive-shapepar"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn30708"

RPM_NAME = "texlive-shapepar-doc-2023.209.2.2svn30708-54.1.noarch.rpm"
RPM_HASH = "ba9024a4a0a1d52561a3093e37e70b19f0be8325816350f17afe29d66c7363677e2b3738f68c695495db86166c9bfb3482c64cb3c36baacf165447adc2d92c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shapepar-doc"

RDEPENDS:${PN} += ""

inherit rpm
