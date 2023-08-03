SUMMARY = "Draw programs like 'scratch'"
DESCRIPTION = "This package permits to draw program charts in the style of the \
scatch project (scratch.mit.edu). It depends on the other LaTeX \
packages TikZ and simplekv."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn61921"

RPM_NAME = "texlive-scratch3-2023.209.0.0.19svn61921-54.1.noarch.rpm"
RPM_HASH = "6f153c5c14fb95a4268088bbf7387f96a7b9f2e53722318e1d84618f9351b1dc0bcf8e27b68fbf6322625857df95061858bfcd2a3543291774e6f210b19ad8ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scratch3.sty \
texlive-scratch3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
