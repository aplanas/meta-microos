SUMMARY = "Documentation for texlive-babel-danish"
DESCRIPTION = "This package includes the documentation for texlive-babel-danish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3ssvn57642"

RPM_NAME = "texlive-babel-danish-doc-2023.201.1.3ssvn57642-53.1.noarch.rpm"
RPM_HASH = "adac654830eae5e5ae98e34d7bf7cde5b21647b031dc2c53d15b84be1e088673b9cf9b563dfebbaebffbbba1a25a50e9b9889b660f55b0260cc3c0d2240bb626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-danish-doc"
RDEPENDS:${PN} += ""

inherit rpm
