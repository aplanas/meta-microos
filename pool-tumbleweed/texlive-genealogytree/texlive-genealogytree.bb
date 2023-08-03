SUMMARY = "Pedigree and genealogical tree diagrams"
DESCRIPTION = "Pedigree and genealogical tree diagrams are proven tools to \
visualize genetic and relational connections between \
individuals. The naming ('tree') derives from historical family \
diagrams. However, even the smallest family entity consisting \
of two parents and several children is hardly a 'mathematical' \
tree -- it is a more general graph. The package provides a set \
of tools to typeset genealogical trees (i.e., to typeset a set \
of special graphs for the description of family-like \
structures). The package uses an autolayout algorithm which can \
be customized, e. g., to prioritize certain paths."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.0svn66513"

RPM_NAME = "texlive-genealogytree-2023.209.2.3.0svn66513-53.1.noarch.rpm"
RPM_HASH = "5619fea29905665f1ca1c587e75cfed9b6281f19818f61aa751eb30a775444c0df92275fbc525da8db64f72aa1b9d6e012c5e7c1e0aee33208e70e10cab80368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-genealogytree.sty \
tex-gtrcore.contour.code.tex \
tex-gtrcore.drawing.code.tex \
tex-gtrcore.node.code.tex \
tex-gtrcore.options.code.tex \
tex-gtrcore.parser.code.tex \
tex-gtrcore.processing.code.tex \
tex-gtrcore.symbols.code.tex \
tex-gtrlang.catalan.code.tex \
tex-gtrlang.chinese.code.tex \
tex-gtrlang.danish.code.tex \
tex-gtrlang.dutch.code.tex \
tex-gtrlang.english.code.tex \
tex-gtrlang.french.code.tex \
tex-gtrlang.german.code.tex \
tex-gtrlang.italian.code.tex \
tex-gtrlang.portuguese.code.tex \
tex-gtrlang.spanish.code.tex \
tex-gtrlang.swedish.code.tex \
tex-gtrlib.debug.code.tex \
tex-gtrlib.fanchart.code.tex \
tex-gtrlib.templates.code.tex \
texlive-genealogytree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tcolorbox.sty \
tex-xfp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
