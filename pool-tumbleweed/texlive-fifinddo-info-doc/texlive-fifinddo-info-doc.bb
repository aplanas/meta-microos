SUMMARY = "Documentation for texlive-fifinddo-info"
DESCRIPTION = "This package includes the documentation for texlive-fifinddo-info"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn29349"

RPM_NAME = "texlive-fifinddo-info-doc-2023.201.1.1bsvn29349-52.1.noarch.rpm"
RPM_HASH = "2ca77ecc265d507f5265ed15f42e7d16b0c81c8feea1b27f68256da72f05367986ed7a4da5df3a51a411633ed6bd75579ae5860a69e06b6058f0f1ff7f3a5879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fifinddo-info-doc-de;en \
texlive-fifinddo-info-doc"

RDEPENDS:${PN} += ""

inherit rpm
