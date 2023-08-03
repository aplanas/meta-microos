SUMMARY = "UML diagrams with PSTricks"
DESCRIPTION = "This a PSTricks package that provides support for drawing \
moderately complex UML (Universal Modelling Language) diagrams. \
(The PDF documentation is written in French.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-2023.209.0.0.83svn15878-54.1.noarch.rpm"
RPM_HASH = "316566b1f9a4c8798f0652301fb7a9eab41dc3a9dada67ea04cd78678521f85cb915246a8510f009b38388ed6e2e289991f6d65d56339053cceb57a3f18c52a3"
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
