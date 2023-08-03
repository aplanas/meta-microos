SUMMARY = "Document class for the Cahiers du GERAD series"
DESCRIPTION = "This package provides the geradwp class, a class based on \
article and compatible with LaTeX. With this class, researchers \
at GERAD will be able to write their working paper while \
complying to all the presentation standards required by the \
Cahiers du GERAD series."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63134"

RPM_NAME = "texlive-geradwp-2023.209.1.1svn63134-53.1.noarch.rpm"
RPM_HASH = "380db866583284c581058ae3ed4680088dac50a98bc1679c0593e9e9eb954476a10bd697c2c7ebef4a224e17626559b3bfc5baf09fbb0f4f3cb9176f13ffbefa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-geradwp.cls \
texlive-geradwp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-article.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-latexsym.sty \
tex-mathrsfs.sty \
tex-multirow.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
