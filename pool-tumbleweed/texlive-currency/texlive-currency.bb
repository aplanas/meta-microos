SUMMARY = "Format currencies in a consistent way"
DESCRIPTION = "The package facilitates the formatting of currencies (amounts \
and units) with various formatting capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.4svn48990"

RPM_NAME = "texlive-currency-2023.204.0.0.4svn48990-54.1.noarch.rpm"
RPM_HASH = "1ca10764c18d8beb119867412a47d6170b3131e80064e1dacb7d127fafdd5ad8cd2077be540ed4e0dec20f30c285110daca4c22b2ba991ca2d6813094953e85f"
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
