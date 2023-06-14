SUMMARY = "Drawing poker cards"
DESCRIPTION = "This PSTricks related package can create poker cards in various \
manners."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.0.0.03bsvn65818"

RPM_NAME = "texlive-pst-poker-2023.201.0.0.03bsvn65818-53.1.noarch.rpm"
RPM_HASH = "5be0499d226759b245ce2fd7a0571e36add8f751dcc3b76469e18f578c886bda6d487e952b4f29c6450b2b3a32fa0072317f1cd8ffdb78184dc7ad5c2fcb5525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-poker.sty \
texlive-pst-poker"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-multido.sty \
tex-pst-blur.sty \
tex-pst-fill.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
