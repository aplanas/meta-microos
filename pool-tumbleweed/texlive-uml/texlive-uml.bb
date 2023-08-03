SUMMARY = "UML diagrams in LaTeX"
DESCRIPTION = "A PSTricks related package for writing UML (Unified Modelling \
Language) diagrams in LaTeX. Currently, it implements a subset \
of class diagrams, and some extra constructs as well. The \
package cannot be used together with pst-uml."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn17476"

RPM_NAME = "texlive-uml-2023.209.0.0.11svn17476-54.1.noarch.rpm"
RPM_HASH = "edefbfb7aec52a81fcfb519300fb60e2be93566cc1e317f6d894dab4c1bf3af8d03d3d10245fccf787e41e1037d65094080e72f74bc3d3760d49d2e9c382a773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uml.sty \
texlive-uml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
