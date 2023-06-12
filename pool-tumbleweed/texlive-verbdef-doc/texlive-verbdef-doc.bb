SUMMARY = "Documentation for texlive-verbdef"
DESCRIPTION = "This package includes the documentation for texlive-verbdef"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn17177"

RPM_NAME = "texlive-verbdef-doc-2023.201.0.0.2svn17177-53.1.noarch.rpm"
RPM_HASH = "32c131bf0e45d7e1e57c55c6ebb48f73f566021188ce32f9ec0e8372c1a9b65cc2cecf9ffb58c872ba263fc8eba5e632279f0e3338e1d7135f20c882741351fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbdef-doc"
RDEPENDS:${PN} += ""

inherit rpm
