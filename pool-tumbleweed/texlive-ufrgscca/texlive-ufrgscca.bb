SUMMARY = "A bundle for undergraduate students final work/report (tcc) at UFRGS/EE"
DESCRIPTION = "This bundled is aimed at producing undergraduate students' \
final work/report at UFRGS/EE (Engineering School at the \
Federal University of Rio Grande do Sul), closely following \
ABNT rules (Brazilian Association for Technical Norms). It is \
composed of a main class, ufrgscca, and a set of auxiliary \
packages, some of which can be used independently."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.8svn65661"

RPM_NAME = "texlive-ufrgscca-2023.201.1.0.8svn65661-53.1.noarch.rpm"
RPM_HASH = "2d8f86a6e932ded2710aefcd36a40616df27677c511eda834bb64c160e804dfa22b6685e38460920eeb8471e13b2bda4e9a8912e433d14c0940e21d7e8dac945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ufrgscca-abnt.sty) \
tex(ufrgscca-coord.sty) \
tex(ufrgscca-core.sty) \
tex(ufrgscca-cover.sty) \
tex(ufrgscca-curr-graph.sty) \
tex(ufrgscca-curr-tab.sty) \
tex(ufrgscca-curr.sty) \
tex(ufrgscca-en-base.def) \
tex(ufrgscca-en-coord.def) \
tex(ufrgscca-en-core.def) \
tex(ufrgscca-en-forms.def) \
tex(ufrgscca-forms.sty) \
tex(ufrgscca-gen.sty) \
tex(ufrgscca-lists.sty) \
tex(ufrgscca-ppc.sty) \
tex(ufrgscca-ptBR-base.def) \
tex(ufrgscca-ptBR-coord.def) \
tex(ufrgscca-ptBR-core.def) \
tex(ufrgscca-ptBR-forms.def) \
tex(ufrgscca.cls) \
texlive-ufrgscca"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(appendix.sty) \
tex(array.sty) \
tex(article.cls) \
tex(babel.sty) \
tex(biblatex.sty) \
tex(bigdelim.sty) \
tex(caption.sty) \
tex(chngcntr.sty) \
tex(circuitikz.sty) \
tex(contour.sty) \
tex(csquotes.sty) \
tex(empheq.sty) \
tex(enumitem.sty) \
tex(etex.sty) \
tex(etoolbox.sty) \
tex(extarrows.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(inputenc.sty) \
tex(keyval.sty) \
tex(listings.sty) \
tex(lmodern.sty) \
tex(longtable.sty) \
tex(mathfixs.sty) \
tex(mathptmx.sty) \
tex(mathrsfs.sty) \
tex(mathtools.sty) \
tex(mdframed.sty) \
tex(microtype.sty) \
tex(newfloat.sty) \
tex(nicematrix.sty) \
tex(pdfcomment.sty) \
tex(pgfcalendar.sty) \
tex(relsize.sty) \
tex(report.cls) \
tex(showframe.sty) \
tex(showlabels.sty) \
tex(silence.sty) \
tex(soul.sty) \
tex(steinmetz.sty) \
tex(titlesec.sty) \
tex(titletoc.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
