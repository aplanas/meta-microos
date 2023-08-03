SUMMARY = "Draw 'funny' objects with PSTricks"
DESCRIPTION = "This is a PSTricks related package for drawing funny objects, \
like ant, bird, fish, kangaroo, ... Such objects may be useful \
for testing other PSTricks macros and/or packages. (Or they can \
be used for fun...)"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn17909"

RPM_NAME = "texlive-pst-fun-2023.209.0.0.04svn17909-53.1.noarch.rpm"
RPM_HASH = "412bb8a4ce40a023d99af76e67d7649f9eb251e3d3bd2b4a77b076c7a7f19bf1a840a83e0ce87ceae7f83908d791587db3cf26188bdcf01f5fb25fb3ab83fe59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fun.sty \
tex-pst-fun.tex \
texlive-pst-fun"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-grad.sty \
tex-pst-slpe.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
