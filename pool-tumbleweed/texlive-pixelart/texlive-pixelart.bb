SUMMARY = "Draw pixel-art pictures"
DESCRIPTION = "A LuaLaTeX package to draw pixel-art pictures using TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn66012"

RPM_NAME = "texlive-pixelart-2023.201.1.0.2svn66012-51.1.noarch.rpm"
RPM_HASH = "c705ba9bea55dca4e4c104e5df652dc7054000fcf7d94808752e8af04f797291fc90658a4f9ba12b03fd6241e04e062514e2b0207a7bf4ed48d38ecdee1b46eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pixelart.sty) \
tex(pixelart0.sty) \
texlive-pixelart"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(iftex.sty) \
tex(luacode.sty) \
tex(pgf.sty) \
tex(pgfkeys.sty) \
tex(pgfopts.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
