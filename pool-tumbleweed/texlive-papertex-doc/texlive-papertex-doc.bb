SUMMARY = "Documentation for texlive-papertex"
DESCRIPTION = "This package includes the documentation for texlive-papertex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn19230"

RPM_NAME = "texlive-papertex-doc-2023.209.1.2bsvn19230-52.1.noarch.rpm"
RPM_HASH = "70a2b7daaf7fcb219d47e019eb1f6d989a62e25212ece85275fc722dc08a5b525644775dc80f85ba2afddc3626e0534469a08a23564cda71036ec29d56e10609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papertex-doc"

RDEPENDS:${PN} += ""

inherit rpm
