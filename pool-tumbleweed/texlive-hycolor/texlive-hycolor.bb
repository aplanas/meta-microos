SUMMARY = "Implements colour for packages hyperref and bookmark"
DESCRIPTION = "This package provides the code for the color option that is \
used by packages hyperref and bookmark. It is not intended as \
package for the user."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.10svn53584"

RPM_NAME = "texlive-hycolor-2023.208.1.10svn53584-53.1.noarch.rpm"
RPM_HASH = "2e96b7a2227e993f90dcc5d399ada1d3e24f5af464232b464daad1237699dbf0404ab63f1311c047d9ccbd20c4fc7dac95595b50887a82b897e647a08d84e4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hycolor.sty \
tex-xcolor-patch.sty \
texlive-hycolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hopatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
