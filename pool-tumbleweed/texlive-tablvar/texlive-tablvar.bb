SUMMARY = "Typesetting pretty tables of signs and variations according to French usage"
DESCRIPTION = "This is a complete and easy-to-use package for typesetting \
pretty tables of signs and variations according to French \
usage. The syntax is similar to that of the array environment \
and uses intuitive position commands. Arrows are drawn \
automatically (using PSTricks by default or TikZ as an option). \
Macros are provided for drawing twin bars, single bars crossing \
the zeros, areas where the function is not defined, or placing \
special values. Several features of the variation tables can be \
customized."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn51543"

RPM_NAME = "texlive-tablvar-2023.209.1.2svn51543-55.1.noarch.rpm"
RPM_HASH = "18f6605613a6b36ad6bb729787e31be911f6f0268c40a0fd8734b30bae75baf0ddbc018f42ed9ffcbb896164ea51b98f0a88878166424ddccdd404cdc65a4a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablvar.sty \
texlive-tablvar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-colortbl.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pst-node.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
