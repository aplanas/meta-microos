SUMMARY = "Precise determination of bounding boxes in TikZ"
DESCRIPTION = "The built-in determination of the bounding box in TikZ is not \
entirely accurate. This is because, for Bezier curves, it is \
the smallest box that contains all control points, which is in \
general larger than the box that just contains the curve. This \
library determines the exact bounding box of the curve."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn57444"

RPM_NAME = "texlive-tikz-bbox-2023.209.0.0.1svn57444-55.1.noarch.rpm"
RPM_HASH = "1970d3ff386402d75a5e95d491ed41fd62d6d446269b9cf69fcd3759c3ef390808aa7444d57e860e3db500805e0f75f4bc449d17ce849a6155bfd0e20dd9b3d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibrarybbox.code.tex \
texlive-tikz-bbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
