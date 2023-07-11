SUMMARY = "Set Operations inside LaTeX documents using Lua"
DESCRIPTION = "The luaset package is developed to define finite sets and \
perform operations on them inside LaTeX documents. There is no \
particular environment in the package for performing set \
operations. The package commands can be used in any environment \
(including the mathematics environment). It is written in Lua, \
and the .tex file is to be compiled with the LuaLaTeX engine. \
The time required for operations on sets is not an issue while \
compiling with the LuaLaTeX engine. There is no need to install \
Lua on the users system as TeX distributions (TeX Live or \
MikTeX) come bundled with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65376"

RPM_NAME = "texlive-luaset-2023.208.1.0svn65376-53.1.noarch.rpm"
RPM_HASH = "242e3b72bf70e44294011420653e13a6659d6c36b178772f4436a53c7902023fd65af9b51490159ff022971c03c4b3b64fbb30380393ac681cde48f3351b6ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaset.sty \
texlive-luaset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luacode.sty \
tex-luamaths.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
