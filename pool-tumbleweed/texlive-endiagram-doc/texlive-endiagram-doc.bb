SUMMARY = "Documentation for texlive-endiagram"
DESCRIPTION = "This package includes the documentation for texlive-endiagram"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1dsvn34486"

RPM_NAME = "texlive-endiagram-doc-2023.201.0.0.1dsvn34486-53.2.noarch.rpm"
RPM_HASH = "45f2f87e0b8b2d0ba7364c494993bae94c289da56bdd07acbce5ec14d2a7f50e990887b2fd44644cf4cc99bd656d88bae7c361e305f05b823dfdc8a1a18e951b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
