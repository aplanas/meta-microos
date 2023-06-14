SUMMARY = "Documentation for texlive-scsnowman"
DESCRIPTION = "This package includes the documentation for texlive-scsnowman"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.3csvn66115"

RPM_NAME = "texlive-scsnowman-doc-2023.201.1.3csvn66115-53.1.noarch.rpm"
RPM_HASH = "d49fe1651d8460e232166485bb442470575eafdba048d7fd7f7ff2b6fa04808b7c7802e044f64d505c03188aaebc880a1b65e2fbc1906811ea676d56f00f07a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scsnowman-doc-ja \
texlive-scsnowman-doc"

RDEPENDS:${PN} += ""

inherit rpm
