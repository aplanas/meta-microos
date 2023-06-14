SUMMARY = "Documentation for texlive-luafindfont"
DESCRIPTION = "This package includes the documentation for texlive-luafindfont"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn64936"

RPM_NAME = "texlive-luafindfont-doc-2023.201.0.0.11svn64936-52.1.noarch.rpm"
RPM_HASH = "7cf58a1cafcdabe01a1225c100c6f6e99bf50ce80035fb36790c0906d3383ba24e9fc8401fbef2d64368e28379fbb1be16a2e0da0e4f4a62e3609fc6413aa238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luafindfont.1 \
texlive-luafindfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
