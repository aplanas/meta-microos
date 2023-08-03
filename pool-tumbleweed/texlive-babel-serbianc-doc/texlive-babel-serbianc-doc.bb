SUMMARY = "Documentation for texlive-babel-serbianc"
DESCRIPTION = "This package includes the documentation for texlive-babel-serbianc"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2asvn64588"

RPM_NAME = "texlive-babel-serbianc-doc-2023.209.3.2asvn64588-54.1.noarch.rpm"
RPM_HASH = "edb035192f5f180eb5c7be32cf311ea7faed3eea6f606f0856ab48288bf869da6ad53803644d64dc3e64d2f77ac6d9d9818408caaa0ff4ccb16d968008311a73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-serbianc-doc"

RDEPENDS:${PN} += ""

inherit rpm
