SUMMARY = "A class to typeset La Gaceta de la RSME"
DESCRIPTION = "The class will typeset papers for <<La Gaceta de la Real \
Sociedad Matematica Espanola>>."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn15878"

RPM_NAME = "texlive-gaceta-2023.209.1.06svn15878-53.1.noarch.rpm"
RPM_HASH = "6a2a2ebcea9b6578faadfcedd0d958f76cd309a584eb1629e3c6b40f00a591e3c55c1190159d69c232476976a1380a0a7c614fceee32f5454599d4b8dbce0c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gaceta.cls \
texlive-gaceta"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-babel.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
