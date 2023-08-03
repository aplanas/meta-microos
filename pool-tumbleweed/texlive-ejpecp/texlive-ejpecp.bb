SUMMARY = "Class for EJP and ECP"
DESCRIPTION = "The class is designed for typesetting articles for the \
mathematical research periodicals Electronic Journal of \
Probability (EJP) and Electronic Communications in Probability \
(ECP). It depends on amsmath, amsfonts, amsthm, bera, dsfont, \
geometry, graphicx, hyperref, lastpage, latexsym, mathtools, \
microtype, and afterpackage."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-2023.209.1.11.3svn60950-54.1.noarch.rpm"
RPM_HASH = "87fd119b155b2b8b68fd7040c9ac884b0e18d3c8afbc80ff67543edefa29cc0dde1b7c814a67eaf1736979a41e214f8d2cb1f7654586cc99135711284ea984cf"
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
