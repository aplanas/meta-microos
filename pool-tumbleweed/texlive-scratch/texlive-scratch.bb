SUMMARY = "Draw programs like 'scratch'"
DESCRIPTION = "This package is now obsolete. From now on, scratch at \
scratch.mit.edu is now version3 with a new design. Please, use \
the 'scratch3' package to draw blocks with the new design. This \
package permits to draw program charts in the style of the \
scatch project (scratch.mit.edu). It depends on the other LaTeX \
packages TikZ and simplekv."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn50073"

RPM_NAME = "texlive-scratch-2023.201.0.0.41svn50073-53.1.noarch.rpm"
RPM_HASH = "e77a411bc6a2fbfef16561503b4a833c66c9f9ab0ac40953fb9f8240e6f615acedfb147e557a42c20c9616d96f7bd295f7b0b3bb8080ce4de0fab7f5313963ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scratch.sty \
texlive-scratch"

RDEPENDS:${PN} += "/bin/sh \
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
