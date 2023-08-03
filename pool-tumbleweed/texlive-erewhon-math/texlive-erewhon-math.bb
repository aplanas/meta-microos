SUMMARY = "Utopia based OpenType Math font"
DESCRIPTION = "OpenType version of the fourier Type1 fonts designed by Michel \
Bovani."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-2023.209.0.0.56svn65684-54.1.noarch.rpm"
RPM_HASH = "eb57ab8d729341f84a5c145cc14e3e308e3f4810c243492bdaa781f6b825521d86008701874aa65a32c3b155cbc5fd3f8cc65724f857ca60d3055908616eb280"
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
