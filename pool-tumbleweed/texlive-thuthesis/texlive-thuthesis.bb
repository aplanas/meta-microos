SUMMARY = "Thesis template for Tsinghua University"
DESCRIPTION = "This package establishes a simple and easy-to-use LaTeX \
template for Tsinghua dissertations, including general \
undergraduate research papers, masters theses, doctoral \
dissertations, and postdoctoral reports."
LICENSE = "LPPL-1.0"

PV = "2023.209.7.3.1svn64628"

RPM_NAME = "texlive-thuthesis-2023.209.7.3.1svn64628-55.1.noarch.rpm"
RPM_HASH = "8dbf1a6c983e80130b96e38cf2de94e4ff2958dc83a97b07d3eb2afc4618e803a807d6236bbd69eeb7d8cef2f5ed887aec5cfe673e4b91510c582abeb2f73191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thuthesis-author-year.bbx \
tex-thuthesis-author-year.cbx \
tex-thuthesis-bachelor.bbx \
tex-thuthesis-bachelor.cbx \
tex-thuthesis-inline.cbx \
tex-thuthesis-numeric.bbx \
tex-thuthesis-numeric.cbx \
tex-thuthesis.cls \
texlive-thuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-bibunits.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-filehook.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-gb7714-2015.bbx \
tex-gb7714-2015.cbx \
tex-gb7714-2015ay.bbx \
tex-gb7714-2015ay.cbx \
tex-geometry.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-notoccite.sty \
tex-pdfpages.sty \
tex-subcaption.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-url.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
