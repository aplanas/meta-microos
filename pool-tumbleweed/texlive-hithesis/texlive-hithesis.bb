SUMMARY = "Harbin Institute of Technology Thesis Template"
DESCRIPTION = "hithesis is a LaTeX thesis template package for Harbin \
Institute of Technology supporting bachelor, master, doctor \
dissertations."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.11svn64005"

RPM_NAME = "texlive-hithesis-2023.209.2.0.11svn64005-54.1.noarch.rpm"
RPM_HASH = "c82197a5f18fa715fe5479a3dd5a372905876ff0cbf4f92c599d45e25696bfe2378319c4c1ebefa60211d463b99e92862b4166bb80efb4beb75fb30dcc4e495f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctex-fontset-siyuan.def \
tex-hithesis.cfg \
tex-hithesis.cls \
tex-hithesis.sty \
texlive-hithesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKfntef.sty \
tex-algorithm2e.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-ccaption.sty \
tex-changepage.sty \
tex-courier.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-flafter.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-layout.sty \
tex-layouts.sty \
tex-lineno.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mathrsfs.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-ntheorem.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-placeins.sty \
tex-rotating.sty \
tex-siunitx.sty \
tex-splitidx.sty \
tex-subfigure.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xltxtra.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
