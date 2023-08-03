SUMMARY = "Documentation for texlive-fewerfloatpages"
DESCRIPTION = "This package includes the documentation for texlive-fewerfloatpages"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0bsvn58058"

RPM_NAME = "texlive-fewerfloatpages-doc-2023.209.1.0bsvn58058-53.1.noarch.rpm"
RPM_HASH = "902269d7f02e325356daef85017d7b2eb78d45eec5e569176553754848d70ee36f3e8747589e58df72abe4569af1e0dcfe0f052c74e61dbb8f2c4a643624beae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fewerfloatpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
