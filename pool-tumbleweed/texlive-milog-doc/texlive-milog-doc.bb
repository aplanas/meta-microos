SUMMARY = "Documentation for texlive-milog"
DESCRIPTION = "This package includes the documentation for texlive-milog"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41610"

RPM_NAME = "texlive-milog-doc-2023.209.1.0svn41610-55.1.noarch.rpm"
RPM_HASH = "006421ae9550304ae0ddc3247084e71dfe7541c3e6624bca73d6ff7d7f59fbd34903184586ff2eb78252dc8fd9a16080d8a8f3ef53616a5e0cb638346e4e5817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-milog-doc-de \
texlive-milog-doc"

RDEPENDS:${PN} += ""

inherit rpm
