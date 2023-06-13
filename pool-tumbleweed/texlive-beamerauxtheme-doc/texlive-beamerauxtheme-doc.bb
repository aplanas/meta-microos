SUMMARY = "Documentation for texlive-beamerauxtheme"
DESCRIPTION = "This package includes the documentation for texlive-beamerauxtheme"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02asvn56087"

RPM_NAME = "texlive-beamerauxtheme-doc-2023.201.1.02asvn56087-53.1.noarch.rpm"
RPM_HASH = "5490d535a83ea5814a3b9c824b642055eb383992cc08e19a0e061b32fe08a4b1cd1fc426eab19a5f92af45ce4f06171ce4dc6b887a04051939cf39c5d3e53521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerauxtheme-doc"

RDEPENDS:${PN} += ""

inherit rpm
