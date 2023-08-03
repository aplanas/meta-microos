SUMMARY = "Documentation for texlive-method"
DESCRIPTION = "This package includes the documentation for texlive-method"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn17485"

RPM_NAME = "texlive-method-doc-2023.209.2.0bsvn17485-55.1.noarch.rpm"
RPM_HASH = "febb0bafe003d3ee9736ce23ea57dbe6fcdeeaaae1314cc4d405511016082a1efdf7793399a5a2b41fc97319d56eae226cc6ffb933a3aa320e0c45b7bad9c43d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-method-doc"

RDEPENDS:${PN} += ""

inherit rpm
