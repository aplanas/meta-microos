SUMMARY = "Documentation for texlive-glossaries-french"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-french"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-doc-2023.201.1.1svn42873-53.2.noarch.rpm"
RPM_HASH = "58a651196ee4993e24178b30cd3e634d1c807dfa1e12a96304cc23e68a124c046a1c820c65592f037d4607dd0e9995d526f9fd6091847194b354a939d937fce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
