SUMMARY = "Documentation for texlive-sa-tikz"
DESCRIPTION = "This package includes the documentation for texlive-sa-tikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7asvn32815"

RPM_NAME = "texlive-sa-tikz-doc-2023.201.0.0.7asvn32815-53.1.noarch.rpm"
RPM_HASH = "e608eff87cdcba9cb6731a8ee68b5a1ea034554e603a7459a420f90d0cf0aa00c5e0d590241a09fc89bb4f9c2a9d96e06edc5aa89b185f3e21a3276589b3fe6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sa-tikz-doc"
RDEPENDS:${PN} += ""

inherit rpm
