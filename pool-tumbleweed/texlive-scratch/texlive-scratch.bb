SUMMARY = "Draw programs like 'scratch'"
DESCRIPTION = "This package is now obsolete. From now on, scratch at \
scratch.mit.edu is now version3 with a new design. Please, use \
the 'scratch3' package to draw blocks with the new design. This \
package permits to draw program charts in the style of the \
scatch project (scratch.mit.edu). It depends on the other LaTeX \
packages TikZ and simplekv."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn50073"

RPM_NAME = "texlive-scratch-2023.209.0.0.41svn50073-54.1.noarch.rpm"
RPM_HASH = "d3072606b94d9bd703471d5bb16c49262231634bec47421545296ed169f36962dca700c9bb6ccc2d3deed969fd2a8cddc22df16ebb7619b0293f22a47572db96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scratch.sty \
texlive-scratch"

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
