SUMMARY = "LaTeX laboratory"
DESCRIPTION = "The LaTeX laboratory provides a route for additions to the \
LaTeX kernel to be stablised, whilst still allowing some \
stability for adventorous users."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64892"

RPM_NAME = "texlive-latex-lab-2023.201.svn64892-55.1.noarch.rpm"
RPM_HASH = "b065b9970a767f7fd803640c25c91973f2b37486783bb320ade515f2fc697da09e794472476c1f8bc2a4aaa538523b887b2d0c5ff453ece96e2fbddbc02cf575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latex-lab-testphase-new-or.sty \
texlive-latex-lab"

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
