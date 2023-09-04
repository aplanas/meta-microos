SUMMARY = "Light weight template for creating school submissions using LaTeX"
DESCRIPTION = "This package is for students creating school submissions using \
LaTeX. It is especially suitable for math, physics, statistics \
and the like. It can easily be used for creating exercises, \
too."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-2023.209.0.0.1.1svn48255-54.2.noarch.rpm"
RPM_HASH = "696932d88686afe930d841aa322e4f9898aab012f490eed0c21574b6c93df9213b8868c68b7bfe6b07438bc451305470b15662aa99f1a131fe23b14d677c92b4"
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
