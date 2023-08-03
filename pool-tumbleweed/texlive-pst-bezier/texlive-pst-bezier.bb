SUMMARY = "Draw Bezier curves"
DESCRIPTION = "The package provides a macro \\psbcurve for drawing a Bezier \
curve. Provision is made for full control of over all the \
control points of the curve."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn41981"

RPM_NAME = "texlive-pst-bezier-2023.209.0.0.03svn41981-53.1.noarch.rpm"
RPM_HASH = "75f3406204595df697d9d274c0e9cd8b10ff684285ed607fd1497e53c9300e69be56526228f38d16e962f364a0cb820573e228f1d78504377f1d4627c372c8ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-bezier.sty \
tex-pst-bezier.tex \
texlive-pst-bezier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
