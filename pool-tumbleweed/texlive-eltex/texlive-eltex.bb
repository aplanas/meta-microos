SUMMARY = "Simple circuit diagrams in LaTeX picture mode"
DESCRIPTION = "The macros enable the user to draw simple circuit diagrams in \
the picture environment, with no need of special resources. The \
macros are appropriate for drawing for school materials. The \
circuit symbols accord to the various parts of the standard IEC \
617."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-eltex-2023.209.2.0svn15878-54.2.noarch.rpm"
RPM_HASH = "d068ef43783755f443d2e7d484b9212af97e0c7d99d0eb529a189a6f5ec29c06af9b50df4306df3167f01d908cdcbe2ef6dcc8fe190884fe4dbc027ea2b0dc02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eltex1.tex \
tex-eltex2.tex \
tex-eltex3.tex \
tex-eltex4.tex \
tex-eltex5.tex \
tex-eltex6.tex \
tex-eltex7.tex \
texlive-eltex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
