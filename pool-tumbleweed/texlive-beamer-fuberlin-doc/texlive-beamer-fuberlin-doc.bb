SUMMARY = "Documentation for texlive-beamer-fuberlin"
DESCRIPTION = "This package includes the documentation for texlive-beamer-fuberlin"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02bsvn63161"

RPM_NAME = "texlive-beamer-fuberlin-doc-2023.201.0.0.02bsvn63161-53.1.noarch.rpm"
RPM_HASH = "499c94a7e249ba9a00122e999862b3157b31bc1d9513c9725282c5d114affd3f58886665cd1747d472b042925c248165b4d801bcd8484d3aa0c8be2dd1fdddeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-fuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
