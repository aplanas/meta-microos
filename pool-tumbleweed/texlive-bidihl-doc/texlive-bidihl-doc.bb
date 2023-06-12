SUMMARY = "Documentation for texlive-bidihl"
DESCRIPTION = "This package includes the documentation for texlive-bidihl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn37795"

RPM_NAME = "texlive-bidihl-doc-2023.201.0.0.1csvn37795-53.1.noarch.rpm"
RPM_HASH = "c1b132bd78ad9df3daa5b8282e4266a9c01be940c7bbb19c62631597ae5fc0fbc4008911808a7334e1d7d9b69bf09dbeabcbfd64afea29ca6bc712f5ac48a134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidihl-doc"
RDEPENDS:${PN} += ""

inherit rpm
