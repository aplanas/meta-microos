SUMMARY = "Draw Bode, Nyquist and Black plots with gnuplot and TikZ"
DESCRIPTION = "The package provides facilities to draw Bode, Nyquist and Black \
plots using Gnuplot and Tikz. Elementary Transfer Functions and \
basic correctors are preprogrammed for use."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn61719"

RPM_NAME = "texlive-bodegraph-2023.209.1.4svn61719-53.1.noarch.rpm"
RPM_HASH = "ad4dcc5720106d635816368312aa6b057061cc75f28fb40d544343fb5e699c7bff443954c4c0d07381d9d24c4b22ddadb9dcfb1913cf7c9582f79f5e1384f5ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bodegraph.sty \
texlive-bodegraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifsym.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
