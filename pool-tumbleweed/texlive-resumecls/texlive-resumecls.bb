SUMMARY = "Typeset a resume both in English and Chinese"
DESCRIPTION = "A LaTeX document class to typeset a resume or CV both in \
English and Chinese with more ease and flexibility."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-2023.209.0.0.4.1svn54815-54.2.noarch.rpm"
RPM_HASH = "0eaeea3442908f2a6cd3fe32693c7771ef1ee896d8e3a9dbaa8e3dc4375516885efc93276b06d95615a882f014a44f15cf30f61977a84c5b3b0c16de98f99dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resumecls.cls \
texlive-resumecls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ctexart.cls \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-natbib.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
