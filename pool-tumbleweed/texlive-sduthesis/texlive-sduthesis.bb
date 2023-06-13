SUMMARY = "Thesis Template of Shandong University"
DESCRIPTION = "Thesis Template of Shandong University."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn41401"

RPM_NAME = "texlive-sduthesis-2023.201.1.2.1svn41401-53.1.noarch.rpm"
RPM_HASH = "ab5921ca68a173dd2af524eaebf924cba7a543f2ecd80c212470ad56525d8a8968c64a83c5ccc64cf397955f31eb34165b4d921e20e295f0effca8751cdcb4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sduthesis-cover.def) \
tex(sduthesis-statement.def) \
tex(sduthesis.cls) \
texlive-sduthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsbsy.sty) \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(bm.sty) \
tex(bmpsize.sty) \
tex(booktabs.sty) \
tex(ctexbook.cls) \
tex(epstopdf.sty) \
tex(etoolbox.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(ifpdf.sty) \
tex(ifxetex.sty) \
tex(kvoptions.sty) \
tex(makecell.sty) \
tex(mathrsfs.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
