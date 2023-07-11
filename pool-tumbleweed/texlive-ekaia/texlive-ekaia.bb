SUMMARY = "Article format for publishing the Basque Country Science and Technology Journal 'Ekaia'"
DESCRIPTION = "The package provides the article format for publishing the \
Basque Country Science and Technology Journal 'Ekaia' at the \
University of the Basque Country."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn49594"

RPM_NAME = "texlive-ekaia-2023.201.1.06svn49594-53.2.noarch.rpm"
RPM_HASH = "c641453efbd75c8486252621cfc3600e72be28e0fbe2876c992aaf55273e06bfa2e4a5ebd67e40fb201cc98eb9f898e715904d20823876a681c086024d66f1fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ekaia.sty \
texlive-ekaia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-basque-date.sty \
tex-ccicons.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-indentfirst.sty \
tex-sectsty.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
