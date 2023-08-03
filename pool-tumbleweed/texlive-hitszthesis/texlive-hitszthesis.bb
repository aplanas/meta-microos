SUMMARY = "A dissertation template for Harbin Institute of Technology, ShenZhen"
DESCRIPTION = "This package provides a dissertation template for Harbin \
Institute of Technology, ShenZhen (HITSZ), including bachelor, \
master and doctor dissertations."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.1svn61073"

RPM_NAME = "texlive-hitszthesis-2023.209.3.2.1svn61073-54.1.noarch.rpm"
RPM_HASH = "ee02de85770529ba1d7031712cda20317fb133f6f62b6007213d43532e03eb22a60943ba7a5388ef218af4a8b729a0985bfc8044c5c8b41c8a3aed1540c9889b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hitszthesis.cls \
tex-hitszthesis.sty \
texlive-hitszthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-ccaption.sty \
tex-changepage.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-flafter.sty \
tex-footmisc.sty \
tex-gbt7714.sty \
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
tex-lipsum.sty \
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
tex-subeqnarray.sty \
tex-subfigure.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xeCJKfntef.sty \
tex-xltxtra.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
