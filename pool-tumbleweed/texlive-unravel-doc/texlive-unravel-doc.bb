SUMMARY = "Documentation for texlive-unravel"
DESCRIPTION = "This package includes the documentation for texlive-unravel"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn59175"

RPM_NAME = "texlive-unravel-doc-2023.201.0.0.3asvn59175-53.1.noarch.rpm"
RPM_HASH = "2563d98dbf12286b57606c65274471a030e2f28481a8a73781cedb1b320fe8313b40196cc07da7656f18f83599cb1b3572ca0ece2e4dc344d9fc7b77aa2b49b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unravel-doc"
RDEPENDS:${PN} += ""

inherit rpm
