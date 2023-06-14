SUMMARY = "PSTricks macros for drawing automata"
DESCRIPTION = "VauCanSon-G is a package that enables the user to draw automata \
within texts written using LaTeX. The package macros make use \
of commands of PStricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn15878"

RPM_NAME = "texlive-vaucanson-g-2023.201.0.0.4svn15878-53.1.noarch.rpm"
RPM_HASH = "c89fc9cc0061d345335191c58bd5a0c720adb7faf542c2b8bb8b0c6a11fcad76a3320d09ef3e0f8eef9e62dc9cd63d62887cc1ec08e4d4f54d2d3a873cab287d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-VCColor-names.def \
tex-VCPref-beamer.tex \
tex-VCPref-default.tex \
tex-VCPref-mystyle.tex \
tex-VCPref-slides.tex \
tex-Vaucanson-G.tex \
tex-vaucanson-g.sty \
tex-vaucanson.sty \
texlive-vaucanson-g"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pst-3d.sty \
tex-pst-coil.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pstricks.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
