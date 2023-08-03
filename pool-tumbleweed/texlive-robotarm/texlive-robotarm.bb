SUMMARY = "TikZ powered LaTeX package to draw parameterized 2D robot arms"
DESCRIPTION = "This LaTeX package uses TikZ to draw parameterized 2D robot \
arms, for example to be used in educational material."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-2023.209.0.0.1svn63116-54.1.noarch.rpm"
RPM_HASH = "04f8bc6f41b85a8d74fd020bbe7f91722e079122d3febaaaf6be70850ea6a709e4df70713999a8c8ce8766a41493fdc20fd6004d96645acaf134c13a5e368596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-robotarm.sty \
texlive-robotarm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
