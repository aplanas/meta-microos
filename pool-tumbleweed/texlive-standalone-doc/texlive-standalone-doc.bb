SUMMARY = "Documentation for texlive-standalone"
DESCRIPTION = "This package includes the documentation for texlive-standalone"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3bsvn64677"

RPM_NAME = "texlive-standalone-doc-2023.201.1.3bsvn64677-57.1.noarch.rpm"
RPM_HASH = "7a381e2aa65f6f46b07bfc40e7098cdf627931d7f2e132eda9c3783265f79651acfc43a7156f111387e9fe59e1c9b539fc814db586ec43fecf9c2c12d4442eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-standalone-doc"

RDEPENDS:${PN} += ""

inherit rpm
