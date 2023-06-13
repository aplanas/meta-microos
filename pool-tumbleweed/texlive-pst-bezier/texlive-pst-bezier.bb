SUMMARY = "Draw Bezier curves"
DESCRIPTION = "The package provides a macro \\psbcurve for drawing a Bezier \
curve. Provision is made for full control of over all the \
control points of the curve."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn41981"

RPM_NAME = "texlive-pst-bezier-2023.201.0.0.03svn41981-52.1.noarch.rpm"
RPM_HASH = "e22f37997cfb9a116a4ca74883cf041903768d4b007f7f2c21bfaa0c3ff8518a3acb389e551c1a756e2f9e3b4d6ec4b8d95f33c2aa419ab3345a91814ebbf8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-bezier.sty) \
tex(pst-bezier.tex) \
texlive-pst-bezier"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
