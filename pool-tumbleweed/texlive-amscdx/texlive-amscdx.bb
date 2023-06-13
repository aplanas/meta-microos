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

PV = "2023.201.2.2xsvn51532"

RPM_NAME = "texlive-amscdx-2023.201.2.2xsvn51532-54.1.noarch.rpm"
RPM_HASH = "57ae4ac458c5b56a51c54d3c90efbc20f2bdef6bc9ab6daf31e8bd597685069b23fc87c46f70a93d30ec6a5eb11dd96c0b10052d056f88b757054db409a08da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(amscdx.sty) \
texlive-amscdx"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsgen.sty) \
tex(graphicx.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
