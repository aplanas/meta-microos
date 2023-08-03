SUMMARY = "Documentation for texlive-floatrow"
DESCRIPTION = "This package includes the documentation for texlive-floatrow"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3bsvn15878"

RPM_NAME = "texlive-floatrow-doc-2023.209.0.0.3bsvn15878-53.1.noarch.rpm"
RPM_HASH = "c0ccb8a92532c3592fa7aae18b4b9e4761b47f1c3540536547dcc51167a0aa4c55c30bb1ae3e3b28155ce68810f799370924049d5671b394edc4b4e4fabc1bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-floatrow-doc-ru;en \
texlive-floatrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
