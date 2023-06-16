SUMMARY = "Insert large images that do not fit into a single page"
DESCRIPTION = "Five different display modes are defined in order to place in a \
document large figures that do not fit into a single page. A \
single user macro is defined to handle all five display modes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.20svn63255"

RPM_NAME = "texlive-swfigure-2023.201.0.0.9.20svn63255-57.1.noarch.rpm"
RPM_HASH = "63b1202d88e209f8d27f9033c521866862d38f73b2db35a5615ceb9bb630d366d2d6d70b09755288855d334a72453f0651549debc371326d72d8d1ac50138627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swfigure.sty \
texlive-swfigure"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-wrapfig.sty \
tex-wrapfig2.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
