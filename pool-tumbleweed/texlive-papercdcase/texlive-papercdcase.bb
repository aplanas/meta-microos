SUMMARY = "Origami-style folding paper CD case"
DESCRIPTION = "This package implements a LaTeX style file to produce \
origami-style folding paper CD cases."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-papercdcase-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "f1d933025a1657f55c71b2b0ae34b84bf78155ae17b7c60fd06417f1a8540f28621419d6a7f416fe6b7eea49ec27f88d65f1a412320ddb06269a595a1368f258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-papercdcase.sty \
texlive-papercdcase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
