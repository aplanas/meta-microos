SUMMARY = "Papers, theses and research proposals in (Applied) Linguistics at Vienna University"
DESCRIPTION = "This bundle provides LaTeX2e classes, BibLaTeX files, and \
templates suitable for student papers, PhD research proposals \
(Exposes), and theses in (Applied) Linguistics at the \
University of Vienna. The classes implement some standards for \
these types of text, such as suitable title pages. They are \
particularly suited for the field of (Applied) Linguistics and \
pre-load some packages that are considered useful in this \
context. The classes can also be used for General and \
Historical Linguistics as well as for other fields of study at \
Vienna University. In this case, however, some settings may \
have to be adjusted."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn65651"

RPM_NAME = "texlive-univie-ling-2023.209.2.3svn65651-54.1.noarch.rpm"
RPM_HASH = "932b268d05dc17ac7abfca61b1faac7432ae5c5acaa4630b32e8088dddbbb47318a129903d7e12eb99e507e5daf486c06176d28e7654be1fcc31ec82faf610e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-univie-ling-expose.cls \
tex-univie-ling-handout.cls \
tex-univie-ling-paper.cls \
tex-univie-ling-poster.cls \
tex-univie-ling-thesis.cls \
tex-univie-ling-wlg.cfg \
tex-univie-ling-wlg.cls \
tex-univie-ling.bbx \
tex-univie-ling.cbx \
texlive-univie-ling"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-DejaVuSansMono.sty \
tex-amssymb.sty \
tex-array.sty \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-babel.sty \
tex-beamer.cls \
tex-beamerposter.sty \
tex-booktabs.sty \
tex-cochineal.sty \
tex-covington.sty \
tex-csquotes.sty \
tex-datetime2.sty \
tex-doclicense.sty \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-lastpage.sty \
tex-mathpazo.sty \
tex-mathptmx.sty \
tex-microtype.sty \
tex-multirow.sty \
tex-pdfpages.sty \
tex-pdfx.sty \
tex-polyglossia.sty \
tex-prettyref.sty \
tex-ragged2e.sty \
tex-refcount.sty \
tex-scalefnt.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-sourcecodepro.sty \
tex-sourcesanspro.sty \
tex-sourceserifpro.sty \
tex-tcolorbox.sty \
tex-textcase.sty \
tex-totpages.sty \
tex-translator.sty \
tex-url.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
