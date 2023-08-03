SUMMARY = "Documentation for texlive-xecyr"
DESCRIPTION = "This package includes the documentation for texlive-xecyr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54308"

RPM_NAME = "texlive-xecyr-doc-2023.209.1.2svn54308-53.1.noarch.rpm"
RPM_HASH = "accb1674f2dd8a8147e57f8b46c340732fcbeeffb15db3d157b04cec47c20465ab0a5c76fe18b24f688dd4e5c303627261f21397571a73d4eacdf0881e2950bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecyr-doc-ru \
texlive-xecyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
