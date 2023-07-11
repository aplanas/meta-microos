SUMMARY = "Easy plots from Matlab in LaTeX"
DESCRIPTION = "Existing approaches to create EPS files from Matlab (laprint, \
mma2ltx, print -eps, etc.) aren't satisfactory; makeplot aims \
to resolve this problem. Makeplot is a LaTeX package that uses \
the pstricks pst-plot functions to plot data that it takes from \
Matlab output files."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.6svn15878"

RPM_NAME = "texlive-makeplot-2023.208.1.0.6svn15878-53.1.noarch.rpm"
RPM_HASH = "b3c01ba8265516227270d92c4ed92832f4a5a7c8023f9b8938df5f7a8f338d67f6b881865e04d4a4da1b5e3e15cbbb08f1bbcfaa18ed8d308c4c6d6d0e7d6377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makeplot.sty \
texlive-makeplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-pst-plot.sty \
tex-pstricks-add.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
