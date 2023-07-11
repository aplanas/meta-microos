SUMMARY = "Search fonts in the LuaTeX font database"
DESCRIPTION = "This Lua script searches for fonts in the font database."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.11svn64936"

RPM_NAME = "texlive-luafindfont-2023.208.0.0.11svn64936-53.1.noarch.rpm"
RPM_HASH = "c072240bcde324fe93dd8cfa4a7e72ab68fa96871d33316c50b68ebd61a1530c84bcb2815e723fda8485660fc36db37d62b79a36e6e0bcc617bb7c2520393eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luafindfont"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luafindfont-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
