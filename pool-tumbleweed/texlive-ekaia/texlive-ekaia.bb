SUMMARY = "Article format for publishing the Basque Country Science and Technology Journal 'Ekaia'"
DESCRIPTION = "The package provides the article format for publishing the \
Basque Country Science and Technology Journal 'Ekaia' at the \
University of the Basque Country."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn49594"

RPM_NAME = "texlive-ekaia-2023.209.1.06svn49594-54.1.noarch.rpm"
RPM_HASH = "cdc20e36c84674fd0f1e211bb1105d27150e839e0d6bd2ae9b30a55a1860312b356ccdf24b290e72328e98668d8d3c714e255f8d776a77cc18d5f4a908cf0775"
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
