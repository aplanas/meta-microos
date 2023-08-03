SUMMARY = "Tabulators and space between paragraphs in galley approach"
DESCRIPTION = "The LaTeX package paravesp controls the spaces above and below \
paragraphs. The python script parades.py generates paragraph \
styles with support of space above, space below and tabulators. \
The system imposes the galley approach on the document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn40042"

RPM_NAME = "texlive-parades-2023.209.svn40042-52.1.noarch.rpm"
RPM_HASH = "c2a64fb4d63a2861d9f77a751ce7e1ed4fae68ae4bf45412885ff2ee131d962769c961c3fd8ae87fda203bad14d6e54c2508aecefb9b8a454d92c18384a760d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paravesp.sty \
texlive-parades"

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
