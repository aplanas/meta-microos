SUMMARY = "A linear algebra package for LaTeX"
DESCRIPTION = "The lualinalg package is developed to perform operations on \
vectors and matrices defined over the field of real or complex \
numbers inside LaTeX documents. It provides flexible ways for \
defining and displaying vectors and matrices. No particular \
environment of LaTeX is required to use commands in the \
package. The package is written in Lua, and tex file is to be \
compiled with the LuaLaTeX engine. The time required for \
calculations is not an issue while compiling with LuaLaTeX. \
There is no need to install Lua on the user's system as TeX \
distributions (TeX Live or MikTeX) come bundled with LuaLaTeX. \
It may also save users' efforts to copy vectors and matrices \
from other software (which may not be in LaTeX-compatible \
format) and to use them in a tex file. The vectors and matrices \
of reasonable size can be handled with ease. The package can be \
modified or extended by writing custom Lua programs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65834"

RPM_NAME = "texlive-lualinalg-2023.201.1.2svn65834-52.1.noarch.rpm"
RPM_HASH = "4343f9cb5be525c7eed38bae8fe30a1313cc8ca5bf98994d8b159d359cc4cd8853f4dd28edd51017c9ef5be50e5d453b29aa24651993e06a2222e4a7537fb518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lualinalg.sty \
texlive-lualinalg"

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
