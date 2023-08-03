SUMMARY = "Documentation for texlive-plautopatch"
DESCRIPTION = "This package includes the documentation for texlive-plautopatch"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.9qsvn64072"

RPM_NAME = "texlive-plautopatch-doc-2023.209.0.0.9qsvn64072-53.1.noarch.rpm"
RPM_HASH = "b37469dea0893fbe7e9420044bde272896e6bf3e89951bc0edd9008e9b26a7dade8383032a1487372446d7e2a3a5e1a1bfb53b75cb49f1a994689bf662cdea96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-plautopatch-doc-ja \
texlive-plautopatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
