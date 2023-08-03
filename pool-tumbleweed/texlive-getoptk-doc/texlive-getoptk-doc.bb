SUMMARY = "Documentation for texlive-getoptk"
DESCRIPTION = "This package includes the documentation for texlive-getoptk"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn23567"

RPM_NAME = "texlive-getoptk-doc-2023.209.1.0svn23567-53.1.noarch.rpm"
RPM_HASH = "f79356572483d4a732e1a9fb9fd92e73b73c008187ccf11e24ca5988c66a8e696cec05620841ab2b963b67ca4df733cadbf0b7d0d9cea417355e03c5a2c7e197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getoptk-doc"

RDEPENDS:${PN} += ""

inherit rpm
