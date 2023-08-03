SUMMARY = "Light weight template for creating school submissions using LaTeX"
DESCRIPTION = "This package is for students creating school submissions using \
LaTeX. It is especially suitable for math, physics, statistics \
and the like. It can easily be used for creating exercises, \
too."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-2023.209.0.0.1.1svn48255-54.1.noarch.rpm"
RPM_HASH = "40b0dd131e9a6c22c6389f5adb8c5b90245ada14b62b0436e177a171969b74fc06f778b8054bd6d43c403c347680fef25a8593f9714c1a1bb1a1a9bced7082d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handin.sty \
texlive-handin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bm.sty \
tex-esint.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-mathtools.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-scrextend.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
