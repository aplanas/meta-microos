SUMMARY = "Documentation for texlive-adfsymbols"
DESCRIPTION = "This package includes the documentation for texlive-adfsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn54512"

RPM_NAME = "texlive-adfsymbols-doc-2023.209.1.2bsvn54512-55.1.noarch.rpm"
RPM_HASH = "bc582758296e9b56a04bfdbc282dfd8a6abe892632080ff3fe29a96fc3330356fc0fb1cc803d7b80bb619198e1e0c05b9b18fc0843c44085cf5dc060efd62385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adfsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
