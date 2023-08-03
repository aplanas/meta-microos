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

PV = "2023.209.1.00svn63116"

RPM_NAME = "texlive-xduthesis-2023.209.1.00svn63116-53.1.noarch.rpm"
RPM_HASH = "69cd282eef656cf42f32a1638ca87dcbd0b1eedba308984b5c4bbe23400fd21588793334ba1facfc345f01975614a92d1ed08cc3d53e3311d8e199a6b4dba3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xduthesis.cfg \
tex-xduthesis.cls \
texlive-xduthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-book.cls \
tex-calc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-metalogo.sty \
tex-natbib.sty \
tex-paralist.sty \
tex-subfig.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-xeCJK.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
