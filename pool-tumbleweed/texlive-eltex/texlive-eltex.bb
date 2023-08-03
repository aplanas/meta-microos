SUMMARY = "Simple circuit diagrams in LaTeX picture mode"
DESCRIPTION = "The macros enable the user to draw simple circuit diagrams in \
the picture environment, with no need of special resources. The \
macros are appropriate for drawing for school materials. The \
circuit symbols accord to the various parts of the standard IEC \
617."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-eltex-2023.209.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "02fcde6cdba6c773cfdea7abac2f405f8529c9bad27428b957828fe82f2450e70bf3eb706f33c0e297b857970366f07e563e65f930438144e47f6da9ba5a2950"
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
