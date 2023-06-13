SUMMARY = "A TikZ library for straight-edge and compass diagrams"
DESCRIPTION = "The package defines some commands and styles to support drawing \
straight-edge and compass diagrams with TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn32392"

RPM_NAME = "texlive-rulercompass-2023.201.1svn32392-53.1.noarch.rpm"
RPM_HASH = "dbf7d537f61e9789ee31d0dfa33242b77a7202cd576614621c5e97e07cd0469e92c92653179ee3d8e536a088662b0249ddcd6c1e679caab4b8b814e507e42e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibraryrulercompass.code.tex) \
texlive-rulercompass"

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
