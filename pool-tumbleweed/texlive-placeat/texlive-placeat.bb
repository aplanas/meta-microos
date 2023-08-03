SUMMARY = "Absolute content positioning"
DESCRIPTION = "The package provides commands so that the user of LuaLaTeX may \
position arbitrary content at any position specified by \
absolute coordinates on the page. The package draws a grid on \
each page of the document, to aid positioning (the grid may be \
disabled, for 'final copy' using the command \\placeatsetup)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1d1svn45145"

RPM_NAME = "texlive-placeat-2023.209.0.0.1d1svn45145-52.1.noarch.rpm"
RPM_HASH = "879c44fbf88338f9933a7333260a02c518d8ebe2d52b192d31f4e4739afac104b5b99581d2a712344e67695ec0e088f97f0366443e9f0d3df7d078a4fe3eeb9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-placeat.sty \
texlive-placeat"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-luacode.sty \
tex-luatexbase.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
