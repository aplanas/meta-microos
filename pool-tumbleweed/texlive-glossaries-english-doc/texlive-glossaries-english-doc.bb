SUMMARY = "Documentation for texlive-glossaries-english"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-english"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "51ede2adae5b28900aedb13ab1d5c99c25fc6dca4914fba37bdbd30be0faef345a803656dfda9aaeed184c92b0fc47a1696c43a9ef671389d43f10d0faff23cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
