SUMMARY = "Timelines for use with moderncv"
DESCRIPTION = "The package provides commands to configure and to draw time \
line diagrams; such diagrams are designed to fit into \
Curriculum Vitae documents written using the moderncv class."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn55518"

RPM_NAME = "texlive-moderntimeline-2023.209.0.0.11svn55518-55.1.noarch.rpm"
RPM_HASH = "7b38ab985e51fa61f8c6fddb9f29d709929d472ad6446281149e8a6b9dac2319dfb29152d3664e5f6359d1e12700e64d99d89a4e39725cbc673fb41b0654be65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moderntimeline.sty \
texlive-moderntimeline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
