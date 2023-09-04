SUMMARY = "Encapsulate Gnuplot sources in LaTeX documents"
DESCRIPTION = "A package to encapsulate gnuplot commands in a LaTeX source \
file, so that a document's figures are maintained in parallel \
with the document source itself."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02asvn20617"

RPM_NAME = "texlive-egplot-2023.209.1.02asvn20617-54.2.noarch.rpm"
RPM_HASH = "a608e635ce23d23cc7a2cd69d14d56f0e0d256210365cc6f1d3ebbbabec3bee6d789658ba9a4d70fe2c8478b9b18600057bfcebff4131c9b9fb0215898e658ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egplot.sty \
texlive-egplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
