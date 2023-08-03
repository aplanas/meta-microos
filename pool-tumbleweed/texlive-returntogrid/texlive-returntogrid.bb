SUMMARY = "Semi-automatic grid typesetting"
DESCRIPTION = "returntogrid offers a few commands to get something like an \
simple, semi-automatic grid typesetting. It does more or less \
what the existing gridset package does. The main differences to \
gridset are that returntogrid works also with LuaLaTeX and that \
it has also a command to do some horizontal movements to get to \
'tab' positions."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-2023.209.0.0.2svn48485-54.1.noarch.rpm"
RPM_HASH = "d35a0a5302250f54bfc5e397189651bef48c1c276575d8be50150d9ee07e897f0df016e939fc07f14698cc2dc861d4a7b44d42045b8dde1ef3d8da1fa27aabec"
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
