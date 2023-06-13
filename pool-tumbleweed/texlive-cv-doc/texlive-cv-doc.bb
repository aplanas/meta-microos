SUMMARY = "Documentation for texlive-cv"
DESCRIPTION = "This package includes the documentation for texlive-cv"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-cv-doc-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "d0438b3f2174fe9b670e1f0007e2bd10a4e841872329838f1cc08299a2e782654d9070ecbee377f30d69df597ddd31f560c2030329135a1d2378b5a67f69c697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
