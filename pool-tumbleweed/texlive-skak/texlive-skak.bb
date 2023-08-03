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

PV = "2023.209.1.5.3svn61719"

RPM_NAME = "texlive-skak-2023.209.1.5.3svn61719-58.1.noarch.rpm"
RPM_HASH = "88f5939028e274a8ea4897d093ab17ae39dc633732084c928838e37f14a90809ba6533fb9ae795980464f9c3b8367768eabe41d4c0edbaa76afb435fa76e47e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skak.fd \
tex-skak.sty \
tex-skak10.tfm \
tex-skak15.tfm \
tex-skak20.tfm \
tex-skak30.tfm \
tex-skakf10.tfm \
tex-skakf10b.tfm \
texlive-skak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-chessfss.sty \
tex-ifthen.sty \
tex-lambda.sty \
tex-pst-node.sty \
tex-pstricks.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
