SUMMARY = "Utopia based OpenType Math font"
DESCRIPTION = "OpenType version of the fourier Type1 fonts designed by Michel \
Bovani."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-2023.201.0.0.56svn65684-53.2.noarch.rpm"
RPM_HASH = "c68da33fc3e867f7a9da886e42eb0275e06dde7ec540f3a02be5ff35e718d666afc788c4e13f33c5e1ec7312c0bada444d72be6ce992d9aa4c88d9f97306de00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fourier-otf.sty \
texlive-erewhon-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fourier-orns.sty \
tex-iftex.sty \
tex-realscripts.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-erewhon-math-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
