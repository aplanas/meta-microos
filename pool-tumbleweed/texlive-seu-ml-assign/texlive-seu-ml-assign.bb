SUMMARY = "Southeast University Machine Learning Assignment template"
DESCRIPTION = "This is a template for the Southeast University Machine \
Learning Assignment that can be easily adapted to other usages. \
This template features a colorful theme that makes it look \
elegant and attractive. You can also find the template \
available on Overleaf."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn62933"

RPM_NAME = "texlive-seu-ml-assign-2023.209.1.1svn62933-54.1.noarch.rpm"
RPM_HASH = "acef2a69305dc195a07d24e0e86f5a25bdf038c690ccf49c34089d594c9e08354bee23e28b589c33b82f3329282464faf9a1863e47060b29b4993448c55472c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seu-ml-assign.cls \
texlive-seu-ml-assign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-bm.sty \
tex-caption.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-mathtools.sty \
tex-nicematrix.sty \
tex-suffix.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-varwidth.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
