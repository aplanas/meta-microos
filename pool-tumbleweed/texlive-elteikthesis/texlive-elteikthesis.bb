SUMMARY = "Thesis template for Eotvos Lorand University (Informatics)"
DESCRIPTION = "This package provides a Bachelor and Master thesis template for \
the Eotvos Lorand University, Faculty of Informatics (Budapest, \
Hungary). The template supports producing both Hungarian and \
English theses."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn63186"

RPM_NAME = "texlive-elteikthesis-2023.209.2.3svn63186-54.2.noarch.rpm"
RPM_HASH = "0576d3d1b4560e4fb985941b4dcdbcdc25e859c9d60840ae316c307ca2969c891a1b0b7f0e37107dcaf2ed2c9d30afefccfeb2ed801ce6597ccce13e3b876e2a"
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
