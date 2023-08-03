SUMMARY = "Documentation for texlive-rsc"
DESCRIPTION = "This package includes the documentation for texlive-rsc"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1fsvn41923"

RPM_NAME = "texlive-rsc-doc-2023.209.3.1fsvn41923-54.1.noarch.rpm"
RPM_HASH = "bd064e439f224fd8b1ec135de0e73e9c944648e109c1dd7feef1277aed56a0127e5f0b302d2d20b1c77efbd33cb530d3e114f60e56d5e7d27a82895c9b7193aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
