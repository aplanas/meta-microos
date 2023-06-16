SUMMARY = "Examples from the book 'Einfuhrung in LuaTeX und LuaLaTeX'"
DESCRIPTION = "The bundle provides source of all the examples published in the \
German book 'Einfuhrung in LuaTeX und LuaLaTeX', published by \
Lehmans Media and DANTE, Berlin."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn35490"

RPM_NAME = "texlive-luaintro-2023.201.0.0.03svn35490-52.1.noarch.rpm"
RPM_HASH = "48e9d1bb0ef5785f4ae52fa83aff5a15961880362c5853dafb92edfcb780875ae6bdabea131e99e2b75a128e21266b5f3ac4be58dc4c42683235bf6e6385ffb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaintro"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
