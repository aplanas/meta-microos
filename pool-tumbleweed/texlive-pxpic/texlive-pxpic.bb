SUMMARY = "Draw pixel pictures"
DESCRIPTION = "With pxpic you draw pictures pixel by pixel. It was inspired by \
a lovely post by Paulo Cereda, among other things (most notably \
a beautiful duck) showcasing the use of characters from the \
Mario video games by Nintendo in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65803"

RPM_NAME = "texlive-pxpic-2023.209.1.4svn65803-54.1.noarch.rpm"
RPM_HASH = "dab580bf5e12470f2a8079b9db2aa32d0f3acb0b94a0c4879636d9e77bc5d29265377c212f6b2e5101d7c171b1cad36230ab9592e8a111e0c0b036f8313f0bd6"
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
