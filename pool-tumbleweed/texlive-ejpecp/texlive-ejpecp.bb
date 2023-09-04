SUMMARY = "Class for EJP and ECP"
DESCRIPTION = "The class is designed for typesetting articles for the \
mathematical research periodicals Electronic Journal of \
Probability (EJP) and Electronic Communications in Probability \
(ECP). It depends on amsmath, amsfonts, amsthm, bera, dsfont, \
geometry, graphicx, hyperref, lastpage, latexsym, mathtools, \
microtype, and afterpackage."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-2023.209.1.11.3svn60950-54.2.noarch.rpm"
RPM_HASH = "fca196df7708e3eb94ac16bcc0b6626257a6ad6457d15e68ae48c99388d12fae38657e22d780697f14f5f330ecd3f9f99e8a95d662fcfdedda6636e221284a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ejpecp.cls \
texlive-ejpecp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpackage.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-auto-pst-pdf.sty \
tex-bera.sty \
tex-dsfont.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-latexsym.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
