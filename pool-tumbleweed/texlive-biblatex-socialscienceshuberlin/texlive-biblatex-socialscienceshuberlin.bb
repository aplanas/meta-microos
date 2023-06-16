SUMMARY = "BibLaTeX-style for the social sciences at HU Berlin"
DESCRIPTION = "This is a BibLaTeX style for the social sciences at the \
Humboldt-Universitat zu Berlin."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1svn47839"

RPM_NAME = "texlive-biblatex-socialscienceshuberlin-2023.201.0.0.0.1svn47839-53.1.noarch.rpm"
RPM_HASH = "5c96d72f50633ce6ba11b66c01932c145646f24e377f0df1c2d5cc8c66f00a01f454f5a601361f61669250a1ca5223bb5f1faf0e6074cf44184c0bf52e76b21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-german-socialscienceshuberlin.lbx \
tex-socialscienceshuberlin.bbx \
tex-socialscienceshuberlin.cbx \
texlive-biblatex-socialscienceshuberlin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ext-authoryear.bbx \
tex-ext-authoryear.cbx \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
