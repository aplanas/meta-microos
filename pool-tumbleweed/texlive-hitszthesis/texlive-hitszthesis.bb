SUMMARY = "A dissertation template for Harbin Institute of Technology, ShenZhen"
DESCRIPTION = "This package provides a dissertation template for Harbin \
Institute of Technology, ShenZhen (HITSZ), including bachelor, \
master and doctor dissertations."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.1svn61073"

RPM_NAME = "texlive-hitszthesis-2023.201.3.2.1svn61073-53.1.noarch.rpm"
RPM_HASH = "8b6e147ed73a3616836b43d05a6acd04e6518cee8ec9550311180aed94be238de78a0be8f50551fcb98189a33f7c92a419a042c8d9683938afe5f4827c23c83c"
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
