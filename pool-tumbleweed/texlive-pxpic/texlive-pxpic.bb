SUMMARY = "Draw pixel pictures"
DESCRIPTION = "With pxpic you draw pictures pixel by pixel. It was inspired by \
a lovely post by Paulo Cereda, among other things (most notably \
a beautiful duck) showcasing the use of characters from the \
Mario video games by Nintendo in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65803"

RPM_NAME = "texlive-pxpic-2023.209.1.4svn65803-54.2.noarch.rpm"
RPM_HASH = "dd4fbfc25a1576dbadd96ef4d87f754b82244730c580bdb1d2a1060eaad87cb3ca3fadd1be970b05137f965d0082d936844b0ebb9c6a16c54bfb3bc90153b216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxpic.sty \
texlive-pxpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
