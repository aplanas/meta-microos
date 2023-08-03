SUMMARY = "Drawing poker cards"
DESCRIPTION = "This PSTricks related package can create poker cards in various \
manners."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.0.0.03bsvn65818"

RPM_NAME = "texlive-pst-poker-2023.209.0.0.03bsvn65818-54.1.noarch.rpm"
RPM_HASH = "10da136065a870e4a6f1b5021947133332fab6b1fe69c435b4c54c40e213d89259eb15fbdc204dc4e2d7b9c135b1d332569595ac07912c9b7407fc481b3c4010"
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
