SUMMARY = "UML diagrams with PSTricks"
DESCRIPTION = "This a PSTricks package that provides support for drawing \
moderately complex UML (Universal Modelling Language) diagrams. \
(The PDF documentation is written in French.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-2023.201.0.0.83svn15878-53.1.noarch.rpm"
RPM_HASH = "f2af562004254774b9eef7c308790d133facb69b13296bca954ac633e9ce253c2bc7903888151e865ed9f73e555ee661f4b327785a4fdf5ff7d0e839fcd0a262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-uml.sty \
texlive-pst-uml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pst-node.sty \
tex-pst-tree.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-multido \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
