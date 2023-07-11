SUMMARY = "Documentation for texlive-qcm"
DESCRIPTION = "This package includes the documentation for texlive-qcm"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn63833"

RPM_NAME = "texlive-qcm-doc-2023.201.2.1svn63833-53.2.noarch.rpm"
RPM_HASH = "20008f1eded0d2c7fff47752499e7439cd8e8a435f8839474450fd03ff246d3bafab163cddbaab4dad9c67b961c396091c9c856ed0139c02d9bd697d2d599b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
