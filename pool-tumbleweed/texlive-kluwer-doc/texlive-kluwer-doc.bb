SUMMARY = "Documentation for texlive-kluwer"
DESCRIPTION = "This package includes the documentation for texlive-kluwer"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-kluwer-doc-2023.201.svn54074-55.1.noarch.rpm"
RPM_HASH = "a561327f8973a7e24713cafecb14be227e39dafe14b1b1f8bad42343003364296e2ffefa1b78995f6882f7a1ade7dd8b06df7cf06b18daf12dc19dcd5389e8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kluwer-doc"
RDEPENDS:${PN} += ""

inherit rpm
