SUMMARY = "BibLaTeX-style for the social sciences at HU Berlin"
DESCRIPTION = "This is a BibLaTeX style for the social sciences at the \
Humboldt-Universitat zu Berlin."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1svn47839"

RPM_NAME = "texlive-biblatex-socialscienceshuberlin-2023.209.0.0.0.1svn47839-54.1.noarch.rpm"
RPM_HASH = "b055ad9e898a9039ae4dc6bf3374c74482395ea724b5edd2e417c6427c518a23b52a14fdacd5a4d982ce36e0df9ece4fad5764498db374255ba8a49ad52d06d1"
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
