SUMMARY = "Civil engineering diagrams, using PSTricks"
DESCRIPTION = "This PSTricks-based package provides facilities to draw \
structural schemes in civil engineering analysis, for beams, \
portals, arches and piles."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-2023.209.0.0.13svn38613-54.1.noarch.rpm"
RPM_HASH = "f568daa825d80f8bddcb3fdff83a689446a97b8affecf4b640b61d68913fe6016b3b4ffc46cd6014f416fad9f67a141b5f29977d7a202bd327f7891a2851079a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-stru.sty \
tex-pst-stru.tex \
texlive-pst-stru"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
