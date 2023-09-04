SUMMARY = "Documentation for texlive-electrum"
DESCRIPTION = "This package includes the documentation for texlive-electrum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.005_bsvn19705"

RPM_NAME = "texlive-electrum-doc-2023.209.1.005_bsvn19705-54.2.noarch.rpm"
RPM_HASH = "e6c77296c894182fe5f393303a5ad7078c05b25a7450edbd151b81d687836aa60a20b8f3915d9ec515dbb304a8b0762fe2a9eb98ece00d9362fd765fa7a15f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-electrum-doc"

RDEPENDS:${PN} += ""

inherit rpm
