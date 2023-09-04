SUMMARY = "Drawing a fidget spinner"
DESCRIPTION = "This package aims to propose a model of the fidget spinner \
gadget. It exists under different forms with 2, 3 poles and \
even more. We chose the most popular model: the triple Fidget \
Spinner. You can run the PSTricks related documents with \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-2023.209.1.02svn66115-54.2.noarch.rpm"
RPM_HASH = "d29e69b61d38011dcab5519f90d3835a13832c49fb2a5918e1bed2626fb0c86aa5764c03b95c1df2cf18151ef19bfd0150a88e77073051be5b3c8518c2685d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-spinner.sty \
tex-pst-spinner.tex \
texlive-pst-spinner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
