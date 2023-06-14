SUMMARY = "A class to typeset La Gaceta de la RSME"
DESCRIPTION = "The class will typeset papers for <<La Gaceta de la Real \
Sociedad Matematica Espanola>>."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn15878"

RPM_NAME = "texlive-gaceta-2023.201.1.06svn15878-52.1.noarch.rpm"
RPM_HASH = "e0e1d58502a87766171ddd4fc02565f499971538b310cc7c1f921e68b58daef5ad85a8250817fab84d86f810dec344bcd6a02f37661cec132213c60e46be7705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gaceta.cls \
texlive-gaceta"

RDEPENDS:${PN} += "/bin/sh \
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
