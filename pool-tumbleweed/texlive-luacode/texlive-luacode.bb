SUMMARY = "Helper for executing lua code from within TeX"
DESCRIPTION = "Executing Lua code from within TeX with directlua can sometimes \
be tricky: there is no easy way to use the percent character, \
counting backslashes may be hard, and Lua comments don't work \
the way you expect. The package provides the \\luaexec command \
and the luacode(*) environments to help with these problems."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn25193"

RPM_NAME = "texlive-luacode-2023.201.1.2asvn25193-52.1.noarch.rpm"
RPM_HASH = "4e04a4805c1fa994a91df98f736d9efac941ee4cab85f4fa46418273c6585f11f919a3c9edd5f655ae91cf3b6967f40cbe4ac1425a1fd67351f0d73464e16d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luacode.sty) \
texlive-luacode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(luatexbase.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
