SUMMARY = "Drawing poker cards"
DESCRIPTION = "This PSTricks related package can create poker cards in various \
manners."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.0.0.03bsvn65818"

RPM_NAME = "texlive-pst-poker-2023.201.0.0.03bsvn65818-53.2.noarch.rpm"
RPM_HASH = "965398f2c9548c7ca8e35b636dd19fd5a5b2e8f7ce5f82574e17cb4eb732359fc706928380a8829374a2432c53dd0244bce8b42d310528602d94ce471d2d2e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-poker.sty \
texlive-pst-poker"

RDEPENDS:${PN} += "/usr/bin/sh \
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
