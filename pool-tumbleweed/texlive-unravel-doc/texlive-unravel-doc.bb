SUMMARY = "Documentation for texlive-unravel"
DESCRIPTION = "This package includes the documentation for texlive-unravel"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn59175"

RPM_NAME = "texlive-unravel-doc-2023.209.0.0.3asvn59175-54.1.noarch.rpm"
RPM_HASH = "e96ab1a7d8bfdd95db0daaacfcabf3b600c6b542b662b3c65ece391103c5e5c468c84f9480e576f0cdb0b10e04cf2d9d7da96468707a139e5600d97873f9b7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unravel-doc"

RDEPENDS:${PN} += ""

inherit rpm
