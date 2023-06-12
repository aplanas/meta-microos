SUMMARY = "Collaborative annotation tool for LaTeX"
DESCRIPTION = "FiXme is a collaborative annotation tool for LaTeX documents. \
Annotating a document here refers to inserting meta-notes, that \
is, notes that do not belong to the document itself, but rather \
to its development or reviewing process. Such notes may involve \
things of different importance levels, ranging from simple 'fix \
the spelling' flags to critical 'this paragraph is a lie' \
mentions. Annotations like this should be visible during the \
development or reviewing phase, but should normally disappear \
in the final version of the document. FiXme is designed to ease \
and automate the process of managing collaborative annotations, \
by offering a set of predefined note levels and layouts, the \
possibility to register multiple authors, to reference \
annotations by listing and indexing etc. FiXme is extensible, \
giving you the possibility to create new layouts or even \
complete 'themes', and also comes with support for AUCTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.5svn63708"

RPM_NAME = "texlive-fixme-2023.201.4.5svn63708-52.1.noarch.rpm"
RPM_HASH = "fc4927658aecdea79745fe344cff29bd391fc3566d9cdf21a32d9387fafca409f82186ccbc1bdc27df06ffff0dd0dd6426e848f5734f70bdbe3b37978df0cf0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fixme.sty) \
tex(fxenvlayoutcolor.sty) \
tex(fxenvlayoutcolorsig.sty) \
tex(fxlayoutmarginnote.sty) \
tex(fxlayoutpdfcmargin.sty) \
tex(fxlayoutpdfcnote.sty) \
tex(fxlayoutpdfcsigmargin.sty) \
tex(fxlayoutpdfcsignote.sty) \
tex(fxlayoutpdfmargin.sty) \
tex(fxlayoutpdfnote.sty) \
tex(fxlayoutpdfsigmargin.sty) \
tex(fxlayoutpdfsignote.sty) \
tex(fxtargetlayoutchangebar.sty) \
tex(fxtargetlayoutcolor.sty) \
tex(fxtargetlayoutcolorcb.sty) \
tex(fxthemecolor.sty) \
tex(fxthemecolorsig.sty) \
tex(fxthemesignature.sty) \
texlive-fixme"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(changebar.sty) \
tex(color.sty) \
tex(ifthen.sty) \
tex(marginnote.sty) \
tex(pdfcomment.sty) \
tex(verbatim.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
