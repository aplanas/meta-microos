SUMMARY = "Semi-automatic grid typesetting"
DESCRIPTION = "returntogrid offers a few commands to get something like an \
simple, semi-automatic grid typesetting. It does more or less \
what the existing gridset package does. The main differences to \
gridset are that returntogrid works also with LuaLaTeX and that \
it has also a command to do some horizontal movements to get to \
'tab' positions."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-2023.201.0.0.2svn48485-53.1.noarch.rpm"
RPM_HASH = "e254f7fc3efbf0cb31c75adbbaaaa41ed289e3e092b44b93df57658335f382b7ca6d1af71134ab5d3d45ef2e239351ef1008a97e78abff529d9d3616b58a5da2"
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
