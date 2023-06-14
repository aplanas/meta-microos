SUMMARY = "Reports for Nanjing University"
DESCRIPTION = "This LaTeX document class provides a thesis template for \
Nanjing University in order to make it easy to write experiment \
reports and homework for the bachelor's curriculum. NJUrepo \
stands for Nanjing University versatile Report."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn50492"

RPM_NAME = "texlive-njurepo-2023.201.1.1.2svn50492-54.1.noarch.rpm"
RPM_HASH = "233b6064cf1e2120bb229a10cd228f6819ac56b00e5a8d31ce3c493caeeb6ce2ed611203b82521fd0d2c1ce6d1b474e0dedb2b54d40aea89ce1b6cb9b00d6ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njurepo.cls \
texlive-njurepo"

RDEPENDS:${PN} += "/bin/sh \
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
