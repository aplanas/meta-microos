SUMMARY = "Documentation for texlive-dijkstra"
DESCRIPTION = "This package includes the documentation for texlive-dijkstra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn64580"

RPM_NAME = "texlive-dijkstra-doc-2023.201.0.0.13svn64580-52.1.noarch.rpm"
RPM_HASH = "ba0c0f9bf58b23c38995449de922c1c8c6bfb4356875fdcb0b1d52ed592685a2d628d0b661e5fd1af57433749cce307e5a974a6df9bc4a28c73e2ff8aad11903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-dijkstra-doc:fr) \
texlive-dijkstra-doc"
RDEPENDS:${PN} += ""

inherit rpm
