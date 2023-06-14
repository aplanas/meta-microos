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

PV = "2023.201.0.0.8svn20843"

RPM_NAME = "texlive-lpic-2023.201.0.0.8svn20843-54.1.noarch.rpm"
RPM_HASH = "26525c7b85b5ba4392cdcce0104c17aed12df821a8cbf701ce27b8c6c54e245b88c99dcf7aa1f81604c42975a81f2d14f912db5ae9d4d44be15eaa986c570b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lpic.sty \
texlive-lpic"

RDEPENDS:${PN} += "/bin/sh \
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
