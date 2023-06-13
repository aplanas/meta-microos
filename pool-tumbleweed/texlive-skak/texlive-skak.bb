SUMMARY = "Fonts and macros for typesetting chess games"
DESCRIPTION = "This package provides macros and fonts in Metafont format which \
can be used to typeset chess games using PGN, and to show \
diagrams of the current board in a document. The package builds \
on work by Piet Tutelaers -- the main novelty is the use of PGN \
for input instead of the more cumbersome coordinate notation \
(g1f3 becomes the more readable Nf3 in PGN). An Adobe Type 1 \
implementation of skak's fonts is available as package skaknew; \
an alternative chess notational scheme is available in package \
texmate, and a general mechanism for selecting chess fonts is \
provided in chessfss."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.3svn61719"

RPM_NAME = "texlive-skak-2023.201.1.5.3svn61719-57.1.noarch.rpm"
RPM_HASH = "b48bc5d42a357a00200b47995113bf8ee359eccbf1c24801aa62bd414967d6934f6374cd76bf163496560e4d30fe6597c0c2f8b2dea02132e855eb7f15583e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(skak.fd) \
tex(skak.sty) \
tex(skak10.tfm) \
tex(skak15.tfm) \
tex(skak20.tfm) \
tex(skak30.tfm) \
tex(skakf10.tfm) \
tex(skakf10b.tfm) \
texlive-skak"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(chessfss.sty) \
tex(ifthen.sty) \
tex(lambda.sty) \
tex(pst-node.sty) \
tex(pstricks.sty) \
tex(textcomp.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
