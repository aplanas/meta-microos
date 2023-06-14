SUMMARY = "LaTeX layout inspired by harvmac"
DESCRIPTION = "The package aims to streamline the work of typesetting, and to \
provide the look and feel of harvmac for readers."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn45081"

RPM_NAME = "texlive-chet-2023.201.2.2svn45081-53.1.noarch.rpm"
RPM_HASH = "1d971d549d6b0b9e3b8e67260ed8580ec52e633ffa3dfa9ca15ba7d15279656e05c78929b4c2df0fa5df4a98825954419d7e40165de6d86620f4ef3615a2e1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chet.sty \
texlive-chet"

RDEPENDS:${PN} += "/bin/sh \
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
