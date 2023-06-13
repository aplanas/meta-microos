SUMMARY = "Documentation for texlive-babel-galician"
DESCRIPTION = "This package includes the documentation for texlive-babel-galician"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.3csvn30270"

RPM_NAME = "texlive-babel-galician-doc-2023.201.4.3csvn30270-53.1.noarch.rpm"
RPM_HASH = "79864968e11901d05ad01b47d367fdef23a0983e53d1832d313d15f18f2f3d4f73b949c3c6253e9c7b77ae8d5b3e53e8390e09085d44cc289448d2acc2f56ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-galician-doc"

RDEPENDS:${PN} += ""

inherit rpm
