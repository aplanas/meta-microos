SUMMARY = "Documentation for texlive-bidishadowtext"
DESCRIPTION = "This package includes the documentation for texlive-bidishadowtext"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34633"

RPM_NAME = "texlive-bidishadowtext-doc-2023.209.0.0.1svn34633-54.1.noarch.rpm"
RPM_HASH = "0d821b676d53a083d45d57f49c611d7e4477133fcb48cfc7b3f6fd935757a0c51216d0062d8944570d91bf18ca209e85e3b3e68a5e4475a03697beed2f5a6ef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidishadowtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
