SUMMARY = "Class for dissertations and theses at the University of Oregon"
DESCRIPTION = "The class generates documents that are suitable for submission \
to the Graduate School and conform with the style requirements \
for dissertations and theses as laid out in the Fall 2010 UO \
graduate school student manual."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5.6svn25355"

RPM_NAME = "texlive-uothesis-2023.209.2.5.6svn25355-54.1.noarch.rpm"
RPM_HASH = "3cd879efb45a5f3198fefd060e4ecd53ea2175ba701cc46fa06113f12a421fea123f997315b2a0b69ea1a745984a0ef9da2060f57cd599c8d3d2f3ba5776beee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uothesis.cls \
texlive-uothesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-draftwatermark.sty \
tex-float.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-layouts.sty \
tex-lineno.sty \
tex-lipsum.sty \
tex-mhchem.sty \
tex-natbib.sty \
tex-ragged2e.sty \
tex-report.cls \
tex-setspace.sty \
tex-subfig.sty \
tex-todonotes.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
