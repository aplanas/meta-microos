SUMMARY = "Search fonts in the LuaTeX font database"
DESCRIPTION = "This Lua script searches for fonts in the font database."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn64936"

RPM_NAME = "texlive-luafindfont-2023.201.0.0.11svn64936-52.1.noarch.rpm"
RPM_HASH = "6b6f41c42ba94f05883120a809b785155b6cb55c17598848f8e86f79e269a5ee2c47e1c98ac0edafe0f90bbaf4e68b985971994b8d71823a10049fdf050e8c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luafindfont"
RDEPENDS:${PN} += "/bin/sh \
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
