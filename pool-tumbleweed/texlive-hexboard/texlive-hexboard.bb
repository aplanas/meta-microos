SUMMARY = "For drawing Hex boards and games"
DESCRIPTION = "hexboard is a package for LaTeX that should also work with \
LuaTeX and XeTeX, that provides functionality for drawing Hex \
boards and games. The aim is a clean, clear design with \
flexibility for drawing different sorts of Hex diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn62102"

RPM_NAME = "texlive-hexboard-2023.209.1.0svn62102-54.2.noarch.rpm"
RPM_HASH = "000f39d33fab5a9601da4ed7583e12d41ebb33e87f78014f9695e3f6168fcc79af298d14166b7b1aee7a7e8eae40b622359b763ecae4a00ac09e2950cfaf9e99"
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
