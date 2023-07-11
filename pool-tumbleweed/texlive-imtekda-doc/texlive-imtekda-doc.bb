SUMMARY = "Documentation for texlive-imtekda"
DESCRIPTION = "This package includes the documentation for texlive-imtekda"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7svn17667"

RPM_NAME = "texlive-imtekda-doc-2023.208.1.7svn17667-53.1.noarch.rpm"
RPM_HASH = "0d36283d98d2878acc22f99d280d1403c70e6c6054a0fdb6c033efa7ff385256ea00955b86900170d2218b4493a6bb91b047566ee3598be666d8a809f27c7f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-imtekda-doc-de \
texlive-imtekda-doc"

RDEPENDS:${PN} += ""

inherit rpm
