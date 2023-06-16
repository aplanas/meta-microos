SUMMARY = "Print a coloured contour around text"
DESCRIPTION = "This package generates a coloured contour around a given text \
in order to enable printing text over a background without the \
need of a coloured box around the text."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.14svn18950"

RPM_NAME = "texlive-contour-2023.204.2.14svn18950-54.1.noarch.rpm"
RPM_HASH = "b2eb1b41458d2224d93caac5bb9edc8b03f017b5f15af2d955c3a4693b0957fa09a950a5bb63af3a011f98f4e226a3199935fa68b83f5c3a7c208974bf986cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-contour.cfg \
tex-contour.sty \
texlive-contour"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-trig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
