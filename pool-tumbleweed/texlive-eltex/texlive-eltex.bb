SUMMARY = "Simple circuit diagrams in LaTeX picture mode"
DESCRIPTION = "The macros enable the user to draw simple circuit diagrams in \
the picture environment, with no need of special resources. The \
macros are appropriate for drawing for school materials. The \
circuit symbols accord to the various parts of the standard IEC \
617."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-eltex-2023.201.2.0svn15878-53.2.noarch.rpm"
RPM_HASH = "4a713db6e1c4d18b4a30bc5eed769ce6b9b3dc13c04d0ba319eea98c23f0833cca45a820587c6441b090c9345cfb1fc47a695856f920eea29458f6e5eb006c06"
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
