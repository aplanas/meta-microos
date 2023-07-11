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

PV = "2023.208.1.0svn65400"

RPM_NAME = "texlive-luamaths-2023.208.1.0svn65400-53.1.noarch.rpm"
RPM_HASH = "0bb95e8e7c0b3d03138833c5105862e23effa228a5674807aee249fe73824a21555ec5caa18d0d9e8741defffc82c12efec798397471cc77d7dbf733b77eafaa"
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
