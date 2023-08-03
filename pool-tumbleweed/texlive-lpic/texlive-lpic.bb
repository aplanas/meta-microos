SUMMARY = "Put LaTeX material over included graphics"
DESCRIPTION = "The package defines a convenient interface to put any LaTeX \
material on top of included graphics. The LaTeX material may \
also be rotated and typeset on top of a white box overshadowing \
the graphics. The coordinates of the LaTeX boxes are given \
relative to the original, unscaled graphics; when the graphics \
is rescaled, the LaTeX annotations stay at their right places \
(unless you do something extreme). In a draft mode, the package \
enables you to draw a coordinate grid over the picture for easy \
adjustment of positions of the annotations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn20843"

RPM_NAME = "texlive-lpic-2023.209.0.0.8svn20843-55.1.noarch.rpm"
RPM_HASH = "39275f73f0fd9b1dcdc218de2a6324804fa15cba314299f291762f86488368451d3b80e20704b91f86fbac7d3862529d3d6c1770039f49b93f5b1de93ec4df35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lpic.sty \
texlive-lpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-epsfig.sty \
tex-ifthen.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
