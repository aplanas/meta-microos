SUMMARY = "Thesis template for Eotvos Lorand University (Informatics)"
DESCRIPTION = "This package provides a Bachelor and Master thesis template for \
the Eotvos Lorand University, Faculty of Informatics (Budapest, \
Hungary). The template supports producing both Hungarian and \
English theses."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn63186"

RPM_NAME = "texlive-elteikthesis-2023.209.2.3svn63186-54.1.noarch.rpm"
RPM_HASH = "ddb83e66408c961d6e654bc2f1245fc56f021c033e05bf1c8603e10900af78fc1497d4497512b3d4dc0f4e7200d9224a325ea12f0dd59a1b5343e9d814221afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elteikthesis.cls \
texlive-elteikthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-algorithm.sty \
tex-algpseudocode.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-appendix.sty \
tex-array.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-color.sty \
tex-csquotes.sty \
tex-epstopdf.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-listingsutf8.sty \
tex-longtable.sty \
tex-makecell.sty \
tex-makeidx.sty \
tex-multirow.sty \
tex-nomencl.sty \
tex-paralist.sty \
tex-parskip.sty \
tex-pdfpages.sty \
tex-preview.sty \
tex-report.cls \
tex-rotating.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-tocloft.sty \
tex-todonotes.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
