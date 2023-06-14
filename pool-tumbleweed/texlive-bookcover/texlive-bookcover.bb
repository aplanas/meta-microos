SUMMARY = "A class for book covers and dust jackets"
DESCRIPTION = "This class helps typesetting book covers and dust jackets."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5svn65394"

RPM_NAME = "texlive-bookcover-2023.201.3.5svn65394-52.1.noarch.rpm"
RPM_HASH = "0689c9d6e75a50b1ee66de5b241af0640d1274c9465ca008136df4cc98eede69a8e70bd437f255e0d6bf38865559f671f38d8bdb8c054824656ca19801df9b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookcover.cls \
texlive-bookcover"

RDEPENDS:${PN} += "/bin/sh \
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
