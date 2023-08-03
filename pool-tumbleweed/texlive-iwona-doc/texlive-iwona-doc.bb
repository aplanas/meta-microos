SUMMARY = "Documentation for texlive-iwona"
DESCRIPTION = "This package includes the documentation for texlive-iwona"
LICENSE = "LPPL-1.3c"

PV = "2023.209.0.0.995bsvn19611"

RPM_NAME = "texlive-iwona-doc-2023.209.0.0.995bsvn19611-56.1.noarch.rpm"
RPM_HASH = "61016e2646ee918c359ca59b3052e9c63f0c3b343d97d708b00f4c7f268416cc88126c1d5c762e396c059357d52fe21fd2f159109ad1634add95679e3321a881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iwona-doc"

RDEPENDS:${PN} += ""

inherit rpm
