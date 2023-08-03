SUMMARY = "Documentation for texlive-abstract"
DESCRIPTION = "This package includes the documentation for texlive-abstract"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn15878"

RPM_NAME = "texlive-abstract-doc-2023.209.1.2asvn15878-55.1.noarch.rpm"
RPM_HASH = "5bdd3b33a839e215b24565c0d28d87888ebc3f9da0b54f119af0180203aeeddf868fecd4e5659e106141e665956570b446de3a7d8b8e983d2e0fba34458d7cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abstract-doc"

RDEPENDS:${PN} += ""

inherit rpm
