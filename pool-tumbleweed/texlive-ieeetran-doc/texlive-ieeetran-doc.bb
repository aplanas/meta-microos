SUMMARY = "Documentation for texlive-ieeetran"
DESCRIPTION = "This package includes the documentation for texlive-ieeetran"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.8bsvn59672"

RPM_NAME = "texlive-ieeetran-doc-2023.208.1.8bsvn59672-53.1.noarch.rpm"
RPM_HASH = "1f73fe309f90f989e8a5efb47b5d224e5f40efb4c9023f48c81a977d5bb965eb48da3763dd0f8a1104421ef49614f11c19c4c1db54f8697a46eb379d283c9887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeetran-doc"

RDEPENDS:${PN} += ""

inherit rpm
