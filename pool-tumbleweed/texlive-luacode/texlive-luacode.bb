SUMMARY = "Helper for executing lua code from within TeX"
DESCRIPTION = "Executing Lua code from within TeX with directlua can sometimes \
be tricky: there is no easy way to use the percent character, \
counting backslashes may be hard, and Lua comments don't work \
the way you expect. The package provides the \\luaexec command \
and the luacode(*) environments to help with these problems."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2asvn25193"

RPM_NAME = "texlive-luacode-2023.208.1.2asvn25193-53.1.noarch.rpm"
RPM_HASH = "89c159c6780e4ab555d54ee02bea3c42f7d65f43f8e0a06bbd8f9590a8b3735fa1cff3e3e209d0ad897201773891d093a23a36bf20bb28703ff30f80ade2ea62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacode.sty \
texlive-luacode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
