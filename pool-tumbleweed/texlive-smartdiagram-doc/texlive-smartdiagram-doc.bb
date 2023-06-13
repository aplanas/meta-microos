SUMMARY = "Documentation for texlive-smartdiagram"
DESCRIPTION = "This package includes the documentation for texlive-smartdiagram"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3bsvn42781"

RPM_NAME = "texlive-smartdiagram-doc-2023.201.0.0.3bsvn42781-57.1.noarch.rpm"
RPM_HASH = "ce0f433bd77651ad4f3d9c4902992eff5cc8036a7bad9d6676443da95e26f41a5f074506c3a16ab1ae0413d8f75b06c08b578c018ef679f0e81d3f820dce5561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartdiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
