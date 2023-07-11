SUMMARY = "UML diagrams with PSTricks"
DESCRIPTION = "This a PSTricks package that provides support for drawing \
moderately complex UML (Universal Modelling Language) diagrams. \
(The PDF documentation is written in French.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-2023.201.0.0.83svn15878-53.2.noarch.rpm"
RPM_HASH = "05f3b809fcef6f1c3d050b1814237c8d45cab4f7f4fc1247e49099c4888a0a9e5aeab29ac86bc169f6a65fd85a9c4280a267f9691f4d7d8a1804c942ee1ad11c"
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
