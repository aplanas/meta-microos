SUMMARY = "Draw Reo Channels and Circuits"
DESCRIPTION = "The package defines macros and other utilities to design Reo \
Circuits. The package requires PGF/TikZ support."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34924"

RPM_NAME = "texlive-reotex-2023.201.1.1svn34924-53.2.noarch.rpm"
RPM_HASH = "72c78a2ac7f0178c4b323112073faf4bdd5aa523a238662585525ba5824dfdb12147fb33d88e78555cdaf68914ed5e6c2e5e58b17625b23254fc9f03abd72a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reotex.sty \
texlive-reotex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
