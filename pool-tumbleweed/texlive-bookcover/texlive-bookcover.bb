SUMMARY = "A class for book covers and dust jackets"
DESCRIPTION = "This class helps typesetting book covers and dust jackets."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5svn65394"

RPM_NAME = "texlive-bookcover-2023.209.3.5svn65394-53.1.noarch.rpm"
RPM_HASH = "679cd9662f78857a4ae79a9821481e714150e9fd56cce2364135a6f8fac5e0613e128c1c03e89cf09600aa2443a05b76f70960861eebeab01342d7b27b3512e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookcover.cls \
texlive-bookcover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-etoolbox.sty \
tex-fgruler.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-picture.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
