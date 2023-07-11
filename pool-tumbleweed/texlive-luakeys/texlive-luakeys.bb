SUMMARY = "A Lua module for parsing key-value options"
DESCRIPTION = "This package provides a Lua module that can parse key-value \
options like the TeX packages keyval, kvsetkeys, kvoptions, \
xkeyval, pgfkeys etc. luakeys, however, accomplishes this task \
entirely by using the Lua language and does not rely on TeX. \
Therefore this package can only be used with the TeX engine \
LuaTeX. Since luakeys uses LPeg, the parsing mechanism should \
be pretty robust."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.13.0svn65533"

RPM_NAME = "texlive-luakeys-2023.208.0.0.13.0svn65533-53.1.noarch.rpm"
RPM_HASH = "b8bb25289eacf6b22ac4994d594f6d553dcf8560456b751728974f6a13203c12bd55524ca948644b24f64e4aa078fd4efcb14b5d7bd535a20114eb50ba0e8d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luakeys-debug.sty \
tex-luakeys-debug.tex \
tex-luakeys.sty \
tex-luakeys.tex \
texlive-luakeys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
