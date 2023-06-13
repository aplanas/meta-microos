SUMMARY = "UML diagrams in LaTeX"
DESCRIPTION = "A PSTricks related package for writing UML (Unified Modelling \
Language) diagrams in LaTeX. Currently, it implements a subset \
of class diagrams, and some extra constructs as well. The \
package cannot be used together with pst-uml."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn17476"

RPM_NAME = "texlive-uml-2023.201.0.0.11svn17476-53.1.noarch.rpm"
RPM_HASH = "5763bed9bd29d95899bf526f5ae9939de270d1bce726541619942ebeae06fcc8da269df88a2256da7d0c4322cd763f2b1ddded76218dd66fafa4dc82aa968cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uml.sty) \
texlive-uml"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pst-node.sty) \
tex(pst-xkey.sty) \
tex(pstricks.sty) \
tex(relsize.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
