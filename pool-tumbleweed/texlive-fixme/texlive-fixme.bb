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

PV = "2023.209.4.5svn63708"

RPM_NAME = "texlive-fixme-2023.209.4.5svn63708-53.1.noarch.rpm"
RPM_HASH = "ae1ec86baa64217b0a923695cfabe19884fe5ce5badda05ba00f07f8f07a0f8f66d3aae22887f3ca9906888c183ae0ecd6fa90a49c83ec5c54de1b3322aeb9f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixme.sty \
tex-fxenvlayoutcolor.sty \
tex-fxenvlayoutcolorsig.sty \
tex-fxlayoutmarginnote.sty \
tex-fxlayoutpdfcmargin.sty \
tex-fxlayoutpdfcnote.sty \
tex-fxlayoutpdfcsigmargin.sty \
tex-fxlayoutpdfcsignote.sty \
tex-fxlayoutpdfmargin.sty \
tex-fxlayoutpdfnote.sty \
tex-fxlayoutpdfsigmargin.sty \
tex-fxlayoutpdfsignote.sty \
tex-fxtargetlayoutchangebar.sty \
tex-fxtargetlayoutcolor.sty \
tex-fxtargetlayoutcolorcb.sty \
tex-fxthemecolor.sty \
tex-fxthemecolorsig.sty \
tex-fxthemesignature.sty \
texlive-fixme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-changebar.sty \
tex-color.sty \
tex-ifthen.sty \
tex-marginnote.sty \
tex-pdfcomment.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
