SUMMARY = "Documentation for texlive-tqft"
DESCRIPTION = "This package includes the documentation for texlive-tqft"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn44455"

RPM_NAME = "texlive-tqft-doc-2023.209.2.1svn44455-53.1.noarch.rpm"
RPM_HASH = "ec12fc57aee29b8cb92bc827f0a7d72229293320520991b4ecfa31f0257a423f8cfbb00d7145bbd6286e3694f9465130b263f30cd2dfc53a09722ea9d8c20213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tqft-doc"

RDEPENDS:${PN} += ""

inherit rpm
