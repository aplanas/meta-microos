SUMMARY = "Operations on complex numbers inside LaTeX documents using Lua"
DESCRIPTION = "The luacomplex package is developed to define complex numbers \
and perform basic arithmetic on complex numbers in LaTeX. It \
also loads the luamathspackage. It provides an easy way to \
define complex numbers and perform operations on complex \
numbers. There is no particular environment for performing \
operations on complex numbers. The package commands can be used \
in any environment (including the mathematics environment). It \
is written in Lua, and the .tex file is to be compiled with the \
LuaLaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65833"

RPM_NAME = "texlive-luacomplex-2023.201.1.2svn65833-52.1.noarch.rpm"
RPM_HASH = "4f24800e90e05ce143d14fb37b71e4d6944eb11e0c7a886dae67f8b3ebba93f5d680698cdcaa33423c4a8ba41d2fa3162e7754959c1182e1065061b0bd1c5a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luacomplex.sty) \
texlive-luacomplex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(luacode.sty) \
tex(luamaths.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
