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

PV = "2023.201.1.2svn51543"

RPM_NAME = "texlive-tablvar-2023.201.1.2svn51543-54.1.noarch.rpm"
RPM_HASH = "5b378195fba27aa4fed09344f03606215d9de48b5ae814d20b195d55e458d8eb0855484ecdb40bfc24f5eb83533e8f0572efcf2995ecbc14cc6da90d3a7860e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tablvar.sty) \
texlive-tablvar"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(colortbl.sty) \
tex(ifthen.sty) \
tex(multido.sty) \
tex(pst-node.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
