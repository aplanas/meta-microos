SUMMARY = "Insert large images that do not fit into a single page"
DESCRIPTION = "Five different display modes are defined in order to place in a \
document large figures that do not fit into a single page. A \
single user macro is defined to handle all five display modes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.20svn63255"

RPM_NAME = "texlive-swfigure-2023.209.0.0.9.20svn63255-58.1.noarch.rpm"
RPM_HASH = "aa4ffeefb696ae780a4955eedecd6737937705550f1b53f604d59f6d9129ffb68c0eacf548ed4b75e70069b8d602c07be1e0a18baa97783b7401d802c44571d1"
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
