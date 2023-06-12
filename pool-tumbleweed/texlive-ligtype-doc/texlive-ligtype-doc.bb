SUMMARY = "Documentation for texlive-ligtype"
DESCRIPTION = "This package includes the documentation for texlive-ligtype"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn63577"

RPM_NAME = "texlive-ligtype-doc-2023.201.0.0.1bsvn63577-54.1.noarch.rpm"
RPM_HASH = "8d368b2eb5526cc75f0cb9571444e5b982952e2572613c05c36e355922041ceb97a9277d0a24274b13b683b72fa50da5b41c8772ebbe6a185cbb92363f28edff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ligtype-doc"
RDEPENDS:${PN} += ""

inherit rpm
