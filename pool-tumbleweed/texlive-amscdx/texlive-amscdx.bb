SUMMARY = "Enhanced commutative diagrams"
DESCRIPTION = "The original amscd package provides a CD environment that \
emulates the commutative diagram capabilities of AMS-TeX \
version 2.x. This means that only simple rectangular diagrams \
are supported, with no diagonal arrows or more exotic features. \
This enhancement package implements double ('fat'), dashed, and \
bidirectional arrows (left-right and up-down), and color \
attributes for arrows and their annotations. The restriction to \
rectangular geometry remains. This nevertheless allows the \
drawing of a much broader class of 'commutative-diagram-like' \
diagrams. This update, 2.2x of 2019-07-02, fixes the \
dashed-arrows parts placement bug, and adds the package option \
'lyx', for use with lyx to prevent conflict with the already \
loaded amscd. The packages xcolor and graphicx are made \
required."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2xsvn51532"

RPM_NAME = "texlive-amscdx-2023.209.2.2xsvn51532-55.1.noarch.rpm"
RPM_HASH = "67033ab5405a1c7923aa954ae586aa20634abf999cae7b61c0dcc84ad223bf4a46fb42c27020964064d542bd6f9a7d477f6fb149f99a9daa45a378724765a96c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amscdx.sty \
texlive-amscdx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsgen.sty \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
