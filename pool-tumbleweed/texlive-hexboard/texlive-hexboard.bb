SUMMARY = "For drawing Hex boards and games"
DESCRIPTION = "hexboard is a package for LaTeX that should also work with \
LuaTeX and XeTeX, that provides functionality for drawing Hex \
boards and games. The aim is a clean, clear design with \
flexibility for drawing different sorts of Hex diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62102"

RPM_NAME = "texlive-hexboard-2023.201.1.0svn62102-53.2.noarch.rpm"
RPM_HASH = "55923887ca33a490ac56a682048551c6db3730d6d38adb57a1f025e22e5a810f4bd3d56562830a295901528551a256274e8a46c9e3487b92585b4d882ddf266c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hexboard.sty \
texlive-hexboard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
