SUMMARY = "Beijing University of Chemical Technology Thesis Template"
DESCRIPTION = "This package provides a LaTeX class and template for Beijing \
University of Chemical Technology, supporting bachelor, master, \
and doctor theses."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.1svn64004"

RPM_NAME = "texlive-buctthesis-2023.209.1.4.1svn64004-53.1.noarch.rpm"
RPM_HASH = "e9cecd656faacdd208fa41e5b28782582799896eda7821dfdb462b32a142847614bd8f63534e44825059dc41bfd3c6320bb263fff19c33241ce1bafcf760916a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-buctcover.cls \
tex-buctthesis.cls \
texlive-buctthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-bicaption.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fgruler.sty \
tex-float.sty \
tex-footmisc.sty \
tex-gbt7714.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-lineno.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mhchem.sty \
tex-multirow.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tabularx.sty \
tex-textpos.sty \
tex-threeparttable.sty \
tex-tikz.sty \
tex-titletoc.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xeCJKfntef.sty \
tex-xifthen.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
