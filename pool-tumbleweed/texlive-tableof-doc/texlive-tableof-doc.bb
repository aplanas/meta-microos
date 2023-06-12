SUMMARY = "Documentation for texlive-tableof"
DESCRIPTION = "This package includes the documentation for texlive-tableof"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4csvn59837"

RPM_NAME = "texlive-tableof-doc-2023.201.1.4csvn59837-57.1.noarch.rpm"
RPM_HASH = "61baa3da2ba9c6e2eba56a3536e3505683cdc1c35cfc1c3a9efaa5ba044374eb9137ad4ebd06a12833cac8c57ad9d7b4ab77a4f934fd3c69d0fb4d993509700a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tableof-doc"
RDEPENDS:${PN} += ""

inherit rpm
