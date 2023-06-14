SUMMARY = "Execute Lua code in any TeX engine that exposes the shell"
DESCRIPTION = "This is an expl3(-generic) package for plain TeX, LaTeX, and \
ConTeXt that allows you to execute Lua code in LuaTeX or any \
other TeX engine that exposes the shell."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.2svn64801"

RPM_NAME = "texlive-lt3luabridge-2023.201.2.0.2svn64801-52.1.noarch.rpm"
RPM_HASH = "402022bbb69bda930f4fedb8297fd1faac264e7d0c4c0aa840138cff14ccfd79f1782f7100ec139c4558d432f175fd2915688202f085daa175391dbea2aa0a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lt3luabridge.sty \
tex-lt3luabridge.tex \
tex-t-lt3luabridge.tex \
texlive-lt3luabridge"

RDEPENDS:${PN} += "/bin/sh \
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
