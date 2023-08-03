SUMMARY = "Documentation for texlive-wordlike"
DESCRIPTION = "This package includes the documentation for texlive-wordlike"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn15878"

RPM_NAME = "texlive-wordlike-doc-2023.209.1.2bsvn15878-54.1.noarch.rpm"
RPM_HASH = "5fe0338b0266775da9f92f202edd048b3d96bd93c60e265554576b00de33d5d7cd6fda5cf3f772dd8768c413d5654c141ee61d46c235b5b73532a217d6fea41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wordlike-doc"

RDEPENDS:${PN} += ""

inherit rpm
