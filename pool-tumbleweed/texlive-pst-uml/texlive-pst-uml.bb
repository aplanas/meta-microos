SUMMARY = "UML diagrams with PSTricks"
DESCRIPTION = "This a PSTricks package that provides support for drawing \
moderately complex UML (Universal Modelling Language) diagrams. \
(The PDF documentation is written in French.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-2023.209.0.0.83svn15878-54.2.noarch.rpm"
RPM_HASH = "7c138bcab46e980da9f4ecea755cdc36de77ab6fe7e38d33b28146f4d8fbfa98d99ee727fd9e93879b4b5225d1c18a44a2de6279b5256e57ac3ff2ee24db03d6"
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
