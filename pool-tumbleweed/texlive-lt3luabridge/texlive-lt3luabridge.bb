SUMMARY = "Execute Lua code in any TeX engine that exposes the shell"
DESCRIPTION = "This is an expl3(-generic) package for plain TeX, LaTeX, and \
ConTeXt that allows you to execute Lua code in LuaTeX or any \
other TeX engine that exposes the shell."
LICENSE = "LPPL-1.0"

PV = "2023.208.2.0.2svn64801"

RPM_NAME = "texlive-lt3luabridge-2023.208.2.0.2svn64801-53.1.noarch.rpm"
RPM_HASH = "625af322f9cf55a2df46321a41e2f27a00f4940f8fc6c6e396fba32e44fde55b2a8fe44386c6074da4a31fd89eb630c993024e11a77008fd1ac455832ac2771a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lt3luabridge.sty \
tex-lt3luabridge.tex \
tex-t-lt3luabridge.tex \
texlive-lt3luabridge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
