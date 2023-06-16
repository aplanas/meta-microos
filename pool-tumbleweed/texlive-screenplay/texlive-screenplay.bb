SUMMARY = "A class file to typeset screenplays"
DESCRIPTION = "The class implements the format recommended by the Academy of \
Motion Picture Arts and Sciences."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn27223"

RPM_NAME = "texlive-screenplay-2023.201.1.6svn27223-53.1.noarch.rpm"
RPM_HASH = "34d9852c1396be5c0f3275c93475cae6c1737ffff9b5ee5e1ed4cc60de648b22f170ebb7cbc4c2d8f6f7cee61151b6fe88d8f596208a2347a4bb57ff441126cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hardmarg.sty \
tex-screenplay.cls \
texlive-screenplay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-courier.sty \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
