SUMMARY = "Documentation for texlive-sidecap"
DESCRIPTION = "This package includes the documentation for texlive-sidecap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7asvn65618"

RPM_NAME = "texlive-sidecap-doc-2023.209.1.7asvn65618-54.1.noarch.rpm"
RPM_HASH = "0eb779a2e5db9478f7a1b83b42a01d76269c1bf0aa9070461db741ed15bf68da4f527342eaf359a24bf91b278c77d46e8c034e39cbe0d5fd6b970655d0695279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidecap-doc"

RDEPENDS:${PN} += ""

inherit rpm
