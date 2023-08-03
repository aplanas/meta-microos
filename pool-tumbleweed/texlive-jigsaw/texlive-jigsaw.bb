SUMMARY = "Draw jigsaw pieces with TikZ"
DESCRIPTION = "This is a small LaTeX package to draw jigsaw pieces with TikZ. \
It is possible to draw individual pieces and adjust their \
shape, create tile patterns or automatically generate complete \
jigsaws."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn66009"

RPM_NAME = "texlive-jigsaw-2023.209.0.0.4svn66009-56.1.noarch.rpm"
RPM_HASH = "c286a064bb8e3aac680218440f2bc6442188c11eb7df70a730a43edd95b9299fa18ae4412c1a448bd8c3ac454a7cfc71f8fbe33268ca44f274e2273306703297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jigsaw.sty \
texlive-jigsaw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
