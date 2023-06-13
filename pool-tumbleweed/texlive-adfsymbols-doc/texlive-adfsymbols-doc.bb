SUMMARY = "Documentation for texlive-adfsymbols"
DESCRIPTION = "This package includes the documentation for texlive-adfsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn54512"

RPM_NAME = "texlive-adfsymbols-doc-2023.201.1.2bsvn54512-54.1.noarch.rpm"
RPM_HASH = "7082ab69c702f1cd41d54e17733aa10f33aeee82eadf72586ae680da0175758c01aee72c7357a0cc984d0bb7c45b03290a1ef0174d6302bbcdd391e12207821a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adfsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
