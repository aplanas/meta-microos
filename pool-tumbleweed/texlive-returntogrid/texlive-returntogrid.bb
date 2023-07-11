SUMMARY = "Semi-automatic grid typesetting"
DESCRIPTION = "returntogrid offers a few commands to get something like an \
simple, semi-automatic grid typesetting. It does more or less \
what the existing gridset package does. The main differences to \
gridset are that returntogrid works also with LuaLaTeX and that \
it has also a command to do some horizontal movements to get to \
'tab' positions."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-2023.201.0.0.2svn48485-53.2.noarch.rpm"
RPM_HASH = "61a7871b29039101902169ae47d37d058a771fb0125bb884fa8da4e399ed6d1caa9493c68d91ec616c66009bb5526ffbd685973ebb6b70ad3c479453e626cf19"
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
