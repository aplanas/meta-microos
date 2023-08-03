SUMMARY = "Draw pixel-art pictures"
DESCRIPTION = "A LuaLaTeX package to draw pixel-art pictures using TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn66012"

RPM_NAME = "texlive-pixelart-2023.209.1.0.2svn66012-52.1.noarch.rpm"
RPM_HASH = "b7c1629f984cdbfa0eb46d1bb97cce04e0ca31c63a5d8879eb8746b1de29b7e2c6eddba4908f5d6fc8372e80730e5f60e5f88c9ef64c4ab4dd4ac49abcd2a2be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pixelart.sty \
tex-pixelart0.sty \
texlive-pixelart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-iftex.sty \
tex-luacode.sty \
tex-pgf.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
