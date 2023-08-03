SUMMARY = "Fancy page border tabs"
DESCRIPTION = "The package can typeset tabs on the side of a page. It requires \
TikZ from the pgf bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn41549"

RPM_NAME = "texlive-fancytabs-2023.209.1.9svn41549-53.1.noarch.rpm"
RPM_HASH = "d97b1969b35edd2bb8e7b9d6b0c45668dbbc08cb76772ca9f0a0c98a6edf8501747032b14063b231fb6a750c7e9f83bb7619d14cd1ee2c183b0b6e72d3dca594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancytabs.sty \
texlive-fancytabs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
