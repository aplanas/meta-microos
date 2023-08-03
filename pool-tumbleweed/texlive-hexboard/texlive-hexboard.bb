SUMMARY = "For drawing Hex boards and games"
DESCRIPTION = "hexboard is a package for LaTeX that should also work with \
LuaTeX and XeTeX, that provides functionality for drawing Hex \
boards and games. The aim is a clean, clear design with \
flexibility for drawing different sorts of Hex diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn62102"

RPM_NAME = "texlive-hexboard-2023.209.1.0svn62102-54.1.noarch.rpm"
RPM_HASH = "f7fca61ca99e5dfd741850df98ef0912ab7926d6185eb9b5eb59b56a9ca32c37168d186e75c87f45030576a060af0802f8e42a40a603edfb2f9d41a65ffb2268"
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
