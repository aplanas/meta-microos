SUMMARY = "LaTeX layout inspired by harvmac"
DESCRIPTION = "The package aims to streamline the work of typesetting, and to \
provide the look and feel of harvmac for readers."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn45081"

RPM_NAME = "texlive-chet-2023.209.2.2svn45081-54.1.noarch.rpm"
RPM_HASH = "6e32bf9cf83257f0277497bffe47479cfd20e571f248f6a7a25c97686ca005eba777682e61cbcff48f364d5d4575b9b696d1c1a497bd674486e640f9a8182d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chet.sty \
texlive-chet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-caption.sty \
tex-cite.sty \
tex-collref.sty \
tex-color.sty \
tex-datetime.sty \
tex-filecontents.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-manyfoot.sty \
tex-microtype.sty \
tex-tocloft.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
