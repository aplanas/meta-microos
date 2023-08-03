SUMMARY = "Documentation for texlive-ctanbib"
DESCRIPTION = "This package includes the documentation for texlive-ctanbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn66068"

RPM_NAME = "texlive-ctanbib-doc-2023.209.0.0.2bsvn66068-55.1.noarch.rpm"
RPM_HASH = "facd417ab3d5801e879f241e9bf4fab961e7e3d0c34e3520254d65bf3722d9416f39a5ee5443cf5951881ecb6a41cc43770bb53dd7fe3f17ed9b682ef77a0fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctanbib.1 \
texlive-ctanbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
