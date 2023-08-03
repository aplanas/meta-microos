SUMMARY = "Extensions for package pict2e"
DESCRIPTION = "The package extends the drawing capacities of the pict2e that \
serves as a LaTeX2e replacement for picture mode. In \
particular, curve2e introduces new macros for lines and \
vectors, new specifications for line terminations and joins, \
arcs with any angular aperture, arcs with arrows at one or both \
ends, generic curves specified with their nodes and the tangent \
direction at these nodes."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.22svn65469"

RPM_NAME = "texlive-curve2e-2023.209.2.2.22svn65469-55.1.noarch.rpm"
RPM_HASH = "b60677aa87c19bcec2d9ce377926207aea971ddaa088771e42c440be61b3e930148479c4f59af9d16a0965aff22cc984903ea90285897ec32a187a3229885462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-curve2e-v161.sty \
tex-curve2e.sty \
texlive-curve2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-pict2e.sty \
tex-xfp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
