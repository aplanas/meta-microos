SUMMARY = "Implementation of the (new in 2015) XeTeX \\Ucharcat command in lua, for LuaTeX"
DESCRIPTION = "The package implements the \\Ucharcat command for LuaLaTeX. \
\\Ucharcat is a new primitive in XeTeX, an extension of the \
existing \\Uchar command, that allows the specification of the \
catcode as well as character code of the character token being \
constructed."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn38907"

RPM_NAME = "texlive-ucharcat-2023.209.0.0.03svn38907-54.1.noarch.rpm"
RPM_HASH = "a3d4a9a579bcd1f8817be3f112a20e1c290cd17faa948d06eb71d70e144270985b3b18cdd9dcc29eca9a6770e6f4ac8e1131ea461394ed54ffa77e7bec5cdb53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucharcat.sty \
texlive-ucharcat"

RDEPENDS:${PN} += "/usr/bin/sh \
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
