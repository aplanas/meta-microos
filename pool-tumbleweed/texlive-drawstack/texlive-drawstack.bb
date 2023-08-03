SUMMARY = "Draw execution stacks"
DESCRIPTION = "This simple LaTeX package provides support for drawing \
execution stack (typically to illustrate assembly language \
notions). The code is written on top of TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28582"

RPM_NAME = "texlive-drawstack-2023.209.svn28582-53.1.noarch.rpm"
RPM_HASH = "5d11c60cdc3fc4bf8a62fdf43ca9ced97d8a5f218c4559e87c2298e5fcb0cd75d833c21e62539dc4424be0790023cfb65e4ce7583182677846f177d17e184aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drawstack.sty \
texlive-drawstack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
