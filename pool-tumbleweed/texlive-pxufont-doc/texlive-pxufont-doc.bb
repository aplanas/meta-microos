SUMMARY = "Documentation for texlive-pxufont"
DESCRIPTION = "This package includes the documentation for texlive-pxufont"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn64072"

RPM_NAME = "texlive-pxufont-doc-2023.209.0.0.6svn64072-54.1.noarch.rpm"
RPM_HASH = "cfe46808a3589a8702f04ff6cebec9ce8fedb187bdb0ab10ac0b523974c722edb2c289d4d505b6cfb5c9b0dd8bedcb0dc6a063572051e07f800ae0a61a5ef0fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxufont-doc"

RDEPENDS:${PN} += ""

inherit rpm
