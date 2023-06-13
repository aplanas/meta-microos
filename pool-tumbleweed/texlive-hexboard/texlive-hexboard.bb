SUMMARY = "For drawing Hex boards and games"
DESCRIPTION = "hexboard is a package for LaTeX that should also work with \
LuaTeX and XeTeX, that provides functionality for drawing Hex \
boards and games. The aim is a clean, clear design with \
flexibility for drawing different sorts of Hex diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62102"

RPM_NAME = "texlive-hexboard-2023.201.1.0svn62102-53.1.noarch.rpm"
RPM_HASH = "2f5a760ffd17279667de259fc016592d9960a17b5d335ccaed6b032238692f50fa5dbfceea4ea7c27070c40dac22a245ab07e6a776f08945f2b2981f48f9a371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hexboard.sty) \
texlive-hexboard"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
