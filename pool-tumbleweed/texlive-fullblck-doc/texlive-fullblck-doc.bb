SUMMARY = "Documentation for texlive-fullblck"
DESCRIPTION = "This package includes the documentation for texlive-fullblck"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn25434"

RPM_NAME = "texlive-fullblck-doc-2023.201.1.03svn25434-52.1.noarch.rpm"
RPM_HASH = "821e6794286b0c492be7de67f14704ef8b61aa5026a5146ffb7d9feee151950b4cb98ad21ac798a9e70ce50b9d59a6e15054a27ad4c20878cb721a6e42702e7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullblck-doc"
RDEPENDS:${PN} += ""

inherit rpm
