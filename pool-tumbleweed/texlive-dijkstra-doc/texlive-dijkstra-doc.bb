SUMMARY = "Documentation for texlive-dijkstra"
DESCRIPTION = "This package includes the documentation for texlive-dijkstra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn64580"

RPM_NAME = "texlive-dijkstra-doc-2023.209.0.0.13svn64580-53.1.noarch.rpm"
RPM_HASH = "5836afdd360a193a5a64a2f1949d8af48b14dd4d420cba892a04587f3fafdd32f99052dd346caa6f19100b574ded8547157dddc1b7df8f862acb82c62305e9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dijkstra-doc-fr \
texlive-dijkstra-doc"

RDEPENDS:${PN} += ""

inherit rpm
