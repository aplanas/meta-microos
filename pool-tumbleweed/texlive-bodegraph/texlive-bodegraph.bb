SUMMARY = "Draw Bode, Nyquist and Black plots with gnuplot and TikZ"
DESCRIPTION = "The package provides facilities to draw Bode, Nyquist and Black \
plots using Gnuplot and Tikz. Elementary Transfer Functions and \
basic correctors are preprogrammed for use."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn61719"

RPM_NAME = "texlive-bodegraph-2023.201.1.4svn61719-52.1.noarch.rpm"
RPM_HASH = "383b4e0a2e0d8b36122b61b6c2fc02051356550f5cc7f1f9fa41582df8c0f901ba7ea4b9a223e92be9c3c69b60f7ff9d4eed019527948e8821d16b41dadf0fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bodegraph.sty) \
texlive-bodegraph"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifsym.sty) \
tex(ifthen.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
