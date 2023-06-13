SUMMARY = "Documentation for texlive-floatrow"
DESCRIPTION = "This package includes the documentation for texlive-floatrow"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3bsvn15878"

RPM_NAME = "texlive-floatrow-doc-2023.201.0.0.3bsvn15878-52.1.noarch.rpm"
RPM_HASH = "5c333f4d176e828874296c304b97bd086e38c7747b7fc5804b2ed6998e09e5e90fdd090b7a5e378d3b5d36bf1461ae0533f3f58808de5e595fe2c1d89ada85d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-floatrow-doc:ru;en) \
texlive-floatrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
