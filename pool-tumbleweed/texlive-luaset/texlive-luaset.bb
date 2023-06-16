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

PV = "2023.201.1.0svn65376"

RPM_NAME = "texlive-luaset-2023.201.1.0svn65376-52.1.noarch.rpm"
RPM_HASH = "200ecf1f68b06d6625fe543e649716f82aa17e2b89d7b8539ea779fc35a9c39f538a45f013f65b6c733a7df6765cdc15472bd8f3e5199498e622c5b3d594adb2"
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
