SUMMARY = "Documentation for texlive-pstool"
DESCRIPTION = "This package includes the documentation for texlive-pstool"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5esvn46393"

RPM_NAME = "texlive-pstool-doc-2023.201.1.5esvn46393-53.2.noarch.rpm"
RPM_HASH = "648dbf7a8b20f4e045be11716e7bb9160e6be0af35a5eb03dd26430686008eca78e082cd05d1a9a1db4162fe829d87e943ba60e04488d69612be979b88784260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstool-doc"

RDEPENDS:${PN} += ""

inherit rpm
