SUMMARY = "A Lua module for parsing key-value options"
DESCRIPTION = "This package provides a Lua module that can parse key-value \
options like the TeX packages keyval, kvsetkeys, kvoptions, \
xkeyval, pgfkeys etc. luakeys, however, accomplishes this task \
entirely by using the Lua language and does not rely on TeX. \
Therefore this package can only be used with the TeX engine \
LuaTeX. Since luakeys uses LPeg, the parsing mechanism should \
be pretty robust."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13.0svn65533"

RPM_NAME = "texlive-luakeys-2023.201.0.0.13.0svn65533-52.1.noarch.rpm"
RPM_HASH = "88908758f6fc15ced7c285b999d06dd3baab3fe78e953a028bad088fbee5a48e6d096d2e69b99e9c4fa4ac2844bf00317993cbc0259547b89723333e34b59b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luakeys-debug.sty) \
tex(luakeys-debug.tex) \
tex(luakeys.sty) \
tex(luakeys.tex) \
texlive-luakeys"
RDEPENDS:${PN} += "/bin/sh \
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
