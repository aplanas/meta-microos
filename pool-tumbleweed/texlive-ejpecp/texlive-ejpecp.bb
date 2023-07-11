SUMMARY = "Class for EJP and ECP"
DESCRIPTION = "The class is designed for typesetting articles for the \
mathematical research periodicals Electronic Journal of \
Probability (EJP) and Electronic Communications in Probability \
(ECP). It depends on amsmath, amsfonts, amsthm, bera, dsfont, \
geometry, graphicx, hyperref, lastpage, latexsym, mathtools, \
microtype, and afterpackage."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-2023.201.1.11.3svn60950-53.2.noarch.rpm"
RPM_HASH = "feb4794c184d04c879f3553cb1ef5ecc4a81b1d92cd76e87d31881af5df037acc7ff7adc8c2ae755e6e70cf76865d49aa46eb9b0ba4bcc182e399f074821e2cb"
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
