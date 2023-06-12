SUMMARY = "A beamer theme for Tsinghua University"
DESCRIPTION = "This package provides a beamer theme designed for Tsinghua \
University."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn61071"

RPM_NAME = "texlive-thubeamer-2023.201.1.1.0svn61071-54.1.noarch.rpm"
RPM_HASH = "6ad2b0b12f87bc73640fe2f0fb666e0a86149d5f79474a1e3a06950db7489a3ef35c8d25bbeff27520b414559c7bb40b9a33b96ad6546e6a49054c6266fb9afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemethubeamer.sty) \
tex(beamerinnerthemethubeamer.sty) \
tex(beamerouterthemethubeamer.sty) \
tex(beamerthemethubeamer.sty) \
texlive-thubeamer"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(algorithm.sty) \
tex(algorithmic.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(bm.sty) \
tex(booktabs.sty) \
tex(calc.sty) \
tex(calligra.sty) \
tex(ctex.sty) \
tex(enumerate.sty) \
tex(fontenc.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(latexsym.sty) \
tex(listings.sty) \
tex(multicol.sty) \
tex(multimedia.sty) \
tex(multirow.sty) \
tex(natbib.sty) \
tex(pgf.sty) \
tex(pstricks.sty) \
tex(stackengine.sty) \
tex(tabularx.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
