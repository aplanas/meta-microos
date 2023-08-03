SUMMARY = "Reports for Nanjing University"
DESCRIPTION = "This LaTeX document class provides a thesis template for \
Nanjing University in order to make it easy to write experiment \
reports and homework for the bachelor's curriculum. NJUrepo \
stands for Nanjing University versatile Report."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn50492"

RPM_NAME = "texlive-njurepo-2023.209.1.1.2svn50492-55.1.noarch.rpm"
RPM_HASH = "6025d0c4f987c95ae7dd2016df61047cfefc3393099116485ed0226ac0fa7ace9e66d3dfb75276456627c48adf76e64052f9451a8e449382ca7181501ae15912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njurepo.cls \
texlive-njurepo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKfntef.sty \
tex-algorithm.sty \
tex-algpseudocode.sty \
tex-amsmath.sty \
tex-array.sty \
tex-bbding.sty \
tex-booktabs.sty \
tex-ctexbook.cls \
tex-diagbox.sty \
tex-dirtree.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-longtable.sty \
tex-makecell.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-notoccite.sty \
tex-ntheorem.sty \
tex-pdfpages.sty \
tex-physics.sty \
tex-stmaryrd.sty \
tex-subcaption.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-verbatim.sty \
tex-watermark.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
