SUMMARY = "Quote verbatim text without white space formatting"
DESCRIPTION = "This package provides an environment for displaying block text \
with special characters, such as verbatim quotes from a referee \
report which may contain pseudo-(La)TeX code. This behaves like \
a verbatim environment, except that it displays its content as \
normal paragraph content, ignoring any white space \
preformatting."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41869"

RPM_NAME = "texlive-phfquotetext-2023.209.1.0svn41869-52.1.noarch.rpm"
RPM_HASH = "9531b2d1fe065e885b6d72fe3baeadd39b2eea190652f65d7fb0c1e9f271805d42f5d45e0b9016def1e786e122746d704dd0a2463fd3100b967c7c5a56a8c348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfquotetext.sty \
texlive-phfquotetext"

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
