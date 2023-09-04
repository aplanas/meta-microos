SUMMARY = "Civil engineering diagrams, using PSTricks"
DESCRIPTION = "This PSTricks-based package provides facilities to draw \
structural schemes in civil engineering analysis, for beams, \
portals, arches and piles."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-2023.209.0.0.13svn38613-54.2.noarch.rpm"
RPM_HASH = "efa7fc6ad59b33a0646108e0b34c2eb82e3dfc7368ccc3780fca029aae15231e33da41b26c644b29b854c02b04065a770a0c6707734f3160f2e1384f29fbeb1a"
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
