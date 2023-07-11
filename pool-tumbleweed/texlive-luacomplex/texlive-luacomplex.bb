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

PV = "2023.208.1.2svn65833"

RPM_NAME = "texlive-luacomplex-2023.208.1.2svn65833-53.1.noarch.rpm"
RPM_HASH = "404b1e736b0d9a842a712ab240a84686739481c026578e9ab914802bd59d14cc77ec0a32b81043ed1aad800c69a5ea4ac22f691058b57aa336160b614535c202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacomplex.sty \
texlive-luacomplex"

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
