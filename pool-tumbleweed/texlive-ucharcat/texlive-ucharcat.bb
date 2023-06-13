SUMMARY = "Implementation of the (new in 2015) XeTeX \\Ucharcat command in lua, for LuaTeX"
DESCRIPTION = "The package implements the \\Ucharcat command for LuaLaTeX. \
\\Ucharcat is a new primitive in XeTeX, an extension of the \
existing \\Uchar command, that allows the specification of the \
catcode as well as character code of the character token being \
constructed."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn38907"

RPM_NAME = "texlive-ucharcat-2023.201.0.0.03svn38907-53.1.noarch.rpm"
RPM_HASH = "296940f0fae211dd552358453bc108e4590246865fd516cae777e471c4551636d8578d0ef24e07d10a0a65d88a87108e84fe723c5262b5522e5f1e697ded9451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ucharcat.sty) \
texlive-ucharcat"

RDEPENDS:${PN} += "/bin/sh \
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
