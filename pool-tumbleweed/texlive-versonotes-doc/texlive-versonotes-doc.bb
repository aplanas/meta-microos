SUMMARY = "Documentation for texlive-versonotes"
DESCRIPTION = "This package includes the documentation for texlive-versonotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn55777"

RPM_NAME = "texlive-versonotes-doc-2023.201.0.0.4svn55777-53.1.noarch.rpm"
RPM_HASH = "3d37ad07b25fd90bdd81f5bd30e8406d4e2d57b6dbf115f98a68c1959759861c6884311462982af9396a88ffc192fd64c7f8ec59d0862a498bcbfa969baba0ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-versonotes-doc"
RDEPENDS:${PN} += ""

inherit rpm
