SUMMARY = "Beijing University of Chemical Technology Thesis Template"
DESCRIPTION = "This package provides a LaTeX class and template for Beijing \
University of Chemical Technology, supporting bachelor, master, \
and doctor theses."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.1svn64004"

RPM_NAME = "texlive-buctthesis-2023.201.1.4.1svn64004-52.1.noarch.rpm"
RPM_HASH = "62fad2cc2e84d894d4d4a17e633b44a5e68d8f6ee4dbba8ea8da0e182159c92bd72f853714027e07a5cc3d6eeca426b3ad28c63f011eb7f879db9f761f26c7f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(buctcover.cls) \
tex(buctthesis.cls) \
texlive-buctthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(array.sty) \
tex(bicaption.sty) \
tex(booktabs.sty) \
tex(calc.sty) \
tex(caption.sty) \
tex(ctexbook.cls) \
tex(enumitem.sty) \
tex(fancyhdr.sty) \
tex(fgruler.sty) \
tex(float.sty) \
tex(footmisc.sty) \
tex(gbt7714.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifxetex.sty) \
tex(kvoptions.sty) \
tex(lineno.sty) \
tex(listings.sty) \
tex(longtable.sty) \
tex(mhchem.sty) \
tex(multirow.sty) \
tex(pdfpages.sty) \
tex(pifont.sty) \
tex(siunitx.sty) \
tex(subcaption.sty) \
tex(tabularx.sty) \
tex(textpos.sty) \
tex(threeparttable.sty) \
tex(tikz.sty) \
tex(titletoc.sty) \
tex(unicode-math.sty) \
tex(xcolor.sty) \
tex(xeCJKfntef.sty) \
tex(xifthen.sty) \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
