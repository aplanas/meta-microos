SUMMARY = "Commands to produce dots in math that respect font size"
DESCRIPTION = "Redefines \\ddots and \\vdots, and defines \\iddots. The dots \
produced by \\iddots slant in the opposite direction to \\ddots. \
All the commands are designed to change size appropriately in \
scripts, as well as in response to LaTeX size changing \
commands. The commands may also be used in plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn34301"

RPM_NAME = "texlive-mathdots-2023.201.0.0.9svn34301-52.1.noarch.rpm"
RPM_HASH = "a899f1adff773bcd37074795aafaac05dc48ac93ca94c92fea7313d65574710c2b5a3d09c0aa38f1154e0720eb0a5387cc1676c536d1b65eb9f26115c9cfeffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathdots.sty \
tex-mathdots.tex \
texlive-mathdots"

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
