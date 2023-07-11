SUMMARY = "Light weight template for creating school submissions using LaTeX"
DESCRIPTION = "This package is for students creating school submissions using \
LaTeX. It is especially suitable for math, physics, statistics \
and the like. It can easily be used for creating exercises, \
too."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-2023.201.0.0.1.1svn48255-53.2.noarch.rpm"
RPM_HASH = "4c35e38e0e2e1e2b8fa52c4038faaf0ee46818f4df9044c2d60a9d66df3af028a50755a19ad2634f35ae01c0a6df86c1236a8738fd7aa1204f710f1a36b1c33a"
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
