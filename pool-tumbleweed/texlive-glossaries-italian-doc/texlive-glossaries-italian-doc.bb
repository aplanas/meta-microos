SUMMARY = "Documentation for texlive-glossaries-italian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-italian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "2545662b780e6cbb9a290f0294e237ed80ba7ad86370d1291d8aa385bb2f8c33063e1671dc2f569dc3e59e58127e5d7b9cf445888447381b5c2693873705d4e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
