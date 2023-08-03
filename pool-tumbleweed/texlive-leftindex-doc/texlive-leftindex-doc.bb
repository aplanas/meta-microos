SUMMARY = "Documentation for texlive-leftindex"
DESCRIPTION = "This package includes the documentation for texlive-leftindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1betasvn56182"

RPM_NAME = "texlive-leftindex-doc-2023.209.0.0.1betasvn56182-55.1.noarch.rpm"
RPM_HASH = "2e9218e9e36e1e8feac1c36cf0563c9b058a5d22b8e50a68ace7ef62af23048ccbc6a86c0d3ace9f9e5f4d2840cad83a27588e8691b0b4520dcc845ad5c90aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leftindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
