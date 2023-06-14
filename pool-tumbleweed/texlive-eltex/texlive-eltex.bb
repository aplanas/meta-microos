SUMMARY = "Simple circuit diagrams in LaTeX picture mode"
DESCRIPTION = "The macros enable the user to draw simple circuit diagrams in \
the picture environment, with no need of special resources. The \
macros are appropriate for drawing for school materials. The \
circuit symbols accord to the various parts of the standard IEC \
617."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-eltex-2023.201.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "0a51c6491594e2d2a84f184ed4114dbe96b56b00c12cd096085cf6d55073fc47d63a40eeb1b021e240a4895c86f60fd0b26f801a4e82d37c36f3004df9068f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eltex1.tex \
tex-eltex2.tex \
tex-eltex3.tex \
tex-eltex4.tex \
tex-eltex5.tex \
tex-eltex6.tex \
tex-eltex7.tex \
texlive-eltex"

RDEPENDS:${PN} += "/bin/sh \
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
