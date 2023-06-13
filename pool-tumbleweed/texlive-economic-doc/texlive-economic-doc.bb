SUMMARY = "Documentation for texlive-economic"
DESCRIPTION = "This package includes the documentation for texlive-economic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32639"

RPM_NAME = "texlive-economic-doc-2023.201.svn32639-53.1.noarch.rpm"
RPM_HASH = "49b5bac8d53abc232cda2193dc3ff1213c14be9dc1c61b6433bc2eb0f4e368a6b2375df3df5b5acc1343324633b621444c81db2bddc58878ab69a9f79a148a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-economic-doc"

RDEPENDS:${PN} += ""

inherit rpm
