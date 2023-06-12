SUMMARY = "XeLaTeX template for writing Xidian University Thesis"
DESCRIPTION = "This is a XeLaTeX template for writing theses to apply academic \
degrees in Xidian University. The template is designed \
according to the official requirements on typesetting theses. \
The template currently supports all levels of degrees from \
bachelor to doctor, including both academic master and \
professional master. But it is not guaranteed that you will \
pass the typesetting check and obtain your degree by using this \
template."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn63116"

RPM_NAME = "texlive-xduthesis-2023.201.1.00svn63116-52.1.noarch.rpm"
RPM_HASH = "a7fd826bdf40b64a5d10994629e0f163ac64e577237fd38bd7c49d8ed80eeca07260de259e06e234b576bf958f421d31795dc13b431493c48cfe7df87772ba4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xduthesis.cfg) \
tex(xduthesis.cls) \
texlive-xduthesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(book.cls) \
tex(calc.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(indentfirst.sty) \
tex(metalogo.sty) \
tex(natbib.sty) \
tex(paralist.sty) \
tex(subfig.sty) \
tex(titlesec.sty) \
tex(titletoc.sty) \
tex(ulem.sty) \
tex(xeCJK.sty) \
tex(xunicode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
