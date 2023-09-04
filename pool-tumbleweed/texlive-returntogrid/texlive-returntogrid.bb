SUMMARY = "Semi-automatic grid typesetting"
DESCRIPTION = "returntogrid offers a few commands to get something like an \
simple, semi-automatic grid typesetting. It does more or less \
what the existing gridset package does. The main differences to \
gridset are that returntogrid works also with LuaLaTeX and that \
it has also a command to do some horizontal movements to get to \
'tab' positions."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-2023.209.0.0.2svn48485-54.2.noarch.rpm"
RPM_HASH = "0a2dc43c56798a4880c9d055d8717f9e86a5eaddd575a7545aa13ddb808ef8d8a3bbbf31acfd1cf6f59a11f3a4aa17593d3f59a3fbdb78c5e246d0b20af705a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-returntogrid.sty \
texlive-returntogrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-xparse.sty \
tex-zref-abspage.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
