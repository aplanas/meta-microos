SUMMARY = "PSTricks macros for drawing automata"
DESCRIPTION = "VauCanSon-G is a package that enables the user to draw automata \
within texts written using LaTeX. The package macros make use \
of commands of PStricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn15878"

RPM_NAME = "texlive-vaucanson-g-2023.209.0.0.4svn15878-54.1.noarch.rpm"
RPM_HASH = "de51ab3e6529de6ea81335e159fd47c9b9d76659215503c911ccb97f3cac9d0dff6964c837733c3150ab8b10bf1ef81ae35cd186310c2e6b3b88796fcec11203"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
