SUMMARY = "Draw pixel pictures"
DESCRIPTION = "With pxpic you draw pictures pixel by pixel. It was inspired by \
a lovely post by Paulo Cereda, among other things (most notably \
a beautiful duck) showcasing the use of characters from the \
Mario video games by Nintendo in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65803"

RPM_NAME = "texlive-pxpic-2023.201.1.4svn65803-53.1.noarch.rpm"
RPM_HASH = "e15b9bbb4c7284f6738abd0e8676d8175525cf47685530c27d5053b826afd75e425f0b28fac555a843d12ee1ff982645c1b21f4f0f5ee3fe98e19c9a9a7a8a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxpic.sty \
texlive-pxpic"

RDEPENDS:${PN} += "/bin/sh \
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
