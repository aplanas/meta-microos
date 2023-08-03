SUMMARY = "Format currencies in a consistent way"
DESCRIPTION = "The package facilitates the formatting of currencies (amounts \
and units) with various formatting capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn48990"

RPM_NAME = "texlive-currency-2023.209.0.0.4svn48990-55.1.noarch.rpm"
RPM_HASH = "cdfe4ce55f0ab3e69f5f64661bdea2ff2cc0f3c36991200302c803dbcf88716feb2ac2cefb2dbfecaff296a45404146a1ae1da194654e247e0abeceef62d12e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-currency.sty \
texlive-currency"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-eurosym.sty \
tex-expl3.sty \
tex-pgfkeys.sty \
tex-siunitx.sty \
tex-textcomp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
