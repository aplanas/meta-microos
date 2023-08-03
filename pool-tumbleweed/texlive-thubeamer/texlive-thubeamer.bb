SUMMARY = "A beamer theme for Tsinghua University"
DESCRIPTION = "This package provides a beamer theme designed for Tsinghua \
University."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn61071"

RPM_NAME = "texlive-thubeamer-2023.209.1.1.0svn61071-55.1.noarch.rpm"
RPM_HASH = "6651471e030001586393b2c61984729de1623a6ff494fb07d32d0dae94c018d40194e5e6925c95ec865b885c288376e18197681eb04992a9f54874f3db4044a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemethubeamer.sty \
tex-beamerinnerthemethubeamer.sty \
tex-beamerouterthemethubeamer.sty \
tex-beamerthemethubeamer.sty \
texlive-thubeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algorithmic.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-calligra.sty \
tex-ctex.sty \
tex-enumerate.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-latexsym.sty \
tex-listings.sty \
tex-multicol.sty \
tex-multimedia.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-pgf.sty \
tex-pstricks.sty \
tex-stackengine.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
