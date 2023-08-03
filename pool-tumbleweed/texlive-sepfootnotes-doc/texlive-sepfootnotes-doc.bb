SUMMARY = "Documentation for texlive-sepfootnotes"
DESCRIPTION = "This package includes the documentation for texlive-sepfootnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3csvn41732"

RPM_NAME = "texlive-sepfootnotes-doc-2023.209.0.0.3csvn41732-54.1.noarch.rpm"
RPM_HASH = "78360d9a3d0365f289e73b421fc212f6cef0980b67cbc85e90f90453c47e828c2b3111481069bdf40124633a33d76289aae9f722aa4c593459266b47489feca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sepfootnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
