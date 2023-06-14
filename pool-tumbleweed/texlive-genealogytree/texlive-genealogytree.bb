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

PV = "2023.201.2.3.0svn66513"

RPM_NAME = "texlive-genealogytree-2023.201.2.3.0svn66513-52.1.noarch.rpm"
RPM_HASH = "92d2ce8374b4f30fba3600fb4f1ec7c2bc5b048c0151cb0c1a2f900c5bde0960c5038c28c35d061ff7637be0964f5d64dfc2953989e150b8b096f3bf763d65e2"
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

RDEPENDS:${PN} += "/bin/sh \
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
