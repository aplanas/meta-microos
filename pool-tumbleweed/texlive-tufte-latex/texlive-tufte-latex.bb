SUMMARY = "Document classes inspired by the work of Edward Tufte"
DESCRIPTION = "Provided are two classes inspired, respectively, by handouts \
and books created by Edward Tufte."
LICENSE = "Apache-1.0"

PV = "2023.209.3.5.2svn37649"

RPM_NAME = "texlive-tufte-latex-2023.209.3.5.2svn37649-53.1.noarch.rpm"
RPM_HASH = "1f434908a96e83fd7ee7ad7c9e1692bc38b369ef8881a81d84a30e008f240dfb734fd571aae27aed29c9823de4b6761ccafac29d73847127ca125fa425cd2491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tufte-book.cls \
tex-tufte-common.def \
tex-tufte-handout.cls \
texlive-tufte-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beramono.sty \
tex-bibentry.sty \
tex-bidi.sty \
tex-changepage.sty \
tex-chngpage.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hardwrap.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-letterspace.sty \
tex-mathpazo.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-optparams.sty \
tex-paralist.sty \
tex-placeins.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-soul.sty \
tex-textcase.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xltxtra.sty \
texlive \
texlive-changepage \
texlive-filesystem \
texlive-ifmtarg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-paralist \
texlive-placeins \
texlive-sauerj \
texlive-scripts \
texlive-scripts-bin \
texlive-xifthen"

inherit rpm
