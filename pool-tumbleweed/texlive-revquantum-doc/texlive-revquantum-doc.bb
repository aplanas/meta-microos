SUMMARY = "Documentation for texlive-revquantum"
DESCRIPTION = "This package includes the documentation for texlive-revquantum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn43505"

RPM_NAME = "texlive-revquantum-doc-2023.201.0.0.11svn43505-53.2.noarch.rpm"
RPM_HASH = "82ef4d6b444b09b500adaee605e18a392bff99c069fc2f5219398995c9843d9c2fa412c724c7378c3e98ee0cd90b9d47e9a79342cb5972d04d4b55d96a235ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revquantum-doc"

RDEPENDS:${PN} += ""

inherit rpm
