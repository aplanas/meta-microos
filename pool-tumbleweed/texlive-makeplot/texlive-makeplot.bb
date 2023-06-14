SUMMARY = "Easy plots from Matlab in LaTeX"
DESCRIPTION = "Existing approaches to create EPS files from Matlab (laprint, \
mma2ltx, print -eps, etc.) aren't satisfactory; makeplot aims \
to resolve this problem. Makeplot is a LaTeX package that uses \
the pstricks pst-plot functions to plot data that it takes from \
Matlab output files."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.6svn15878"

RPM_NAME = "texlive-makeplot-2023.201.1.0.6svn15878-52.1.noarch.rpm"
RPM_HASH = "b229225b9ca53cbed0cb69719001cd00f7e858262f259a0fa393963b8fd08c7c4123bb75ab7ea635f5685ef9782bbac41c73a9e61e6c0edf179a543d1dd763e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makeplot.sty \
texlive-makeplot"

RDEPENDS:${PN} += "/bin/sh \
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
