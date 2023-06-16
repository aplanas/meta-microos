SUMMARY = "Provide standard mathematical operations inside LaTeX documents using Lua"
DESCRIPTION = "The luamaths package is developed to perform standard \
mathematical operations inside LaTeX documents using Lua. It \
provides an easy way to perform standard mathematical \
operations. There is no particular environment in the package \
for performing mathematical operations. The package commands \
can be used in any environment (including the mathematics \
environment). There is no need to install Lua on users system \
as TeX distributions (TeX Live or MikTeX) come bundled with \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65400"

RPM_NAME = "texlive-luamaths-2023.201.1.0svn65400-52.1.noarch.rpm"
RPM_HASH = "318c9cc5ac285db3c934881e8921645ddfc1433ff548eb931e89213b0af724a39bacd83278431301597a8712c42313c3a67513ae9356043a4a97aae66428a0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamaths.sty \
texlive-luamaths"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luacode.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
