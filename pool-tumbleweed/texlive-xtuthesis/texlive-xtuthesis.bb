SUMMARY = "XTU thesis template"
DESCRIPTION = "The package provides a thesis template for the Xiangtan \
University."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-2023.209.1.0svn47049-53.1.noarch.rpm"
RPM_HASH = "59ec246c1d8e10e251969d566510aa3f31af1d6b3100f3cfba5d1467909186e11c8c6ade8af13f962bdbf593b2250ee335957096c9513f91fbe900e595d6f694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtuformat.sty \
texlive-xtuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amscd.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-caption.sty \
tex-cite.sty \
tex-color.sty \
tex-graphicx.sty \
tex-latexsym.sty \
tex-mathrsfs.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
