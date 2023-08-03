SUMMARY = "Print a coloured contour around text"
DESCRIPTION = "This package generates a coloured contour around a given text \
in order to enable printing text over a background without the \
need of a coloured box around the text."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn18950"

RPM_NAME = "texlive-contour-2023.209.2.14svn18950-55.1.noarch.rpm"
RPM_HASH = "98dde256025083996c50f0bb1aeb6d4323d36c85c1a31b9a83d9ca23c60a6e7517aba49d045a4699e532dcdcfafdbeaf0ebc3a7bd27f7d3a24f8b80171a51d3b"
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
