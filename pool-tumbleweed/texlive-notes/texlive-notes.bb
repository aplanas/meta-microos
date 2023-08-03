SUMMARY = "Mark sections of a document"
DESCRIPTION = "The package provides environments to highlight significant \
portions of text within a document, by putting the text in a \
box and adding an icon in the margin. (The icons are provided \
as 'fig' sources, processable by xfig.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn42428"

RPM_NAME = "texlive-notes-2023.209.1.0.1svn42428-55.1.noarch.rpm"
RPM_HASH = "ee27151acd9ad6459e8e4bb7fbaa6390f9285cbc7e9062c441b8d3371ddbaf0e1bf13f5ab71aa7dbc4392ef120328b4a5ef8512bce86a94e9993d3b18d6af285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notes.sty \
texlive-notes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
