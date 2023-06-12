SUMMARY = "Documentation for texlive-biblatex-spbasic"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-spbasic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn61439"

RPM_NAME = "texlive-biblatex-spbasic-doc-2023.201.0.0.04svn61439-53.1.noarch.rpm"
RPM_HASH = "becf1e23294b0457a6bdb02a7f5bc13715766394246a3cee2d605100e725d7238ec87ef0977f1b7bb072f7d0b373d1e1ce3797bf238798f323e67de2648e2d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-spbasic-doc"
RDEPENDS:${PN} += ""

inherit rpm
