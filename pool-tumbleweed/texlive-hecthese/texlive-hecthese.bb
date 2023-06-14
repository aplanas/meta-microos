SUMMARY = "A class for dissertations and theses at HEC Montreal"
DESCRIPTION = "This package provides the hecthese class, a class based on \
memoir and compatible with LaTeX. Using this class, \
postgraduate students at HEC Montreal will be able to write \
their dissertation or thesis while complying with all the \
presentation standards required by the University. This class \
is meant to be as flexible as possible; in particular, there \
are very few hardcoded features except those that take care of \
the document's layout. Dissertations and theses at HEC Montreal \
can be written on a per-chapter or per-article basis. Documents \
that are written on a per-article basis require a bibliography \
for each of the included articles and a general bibliography \
for the entire document. The hecthese class takes care of these \
requirements. The class depends on babel, color, enumitem, \
fontawesome, framed, numprint, url, and hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn60455"

RPM_NAME = "texlive-hecthese-2023.201.1.5svn60455-53.1.noarch.rpm"
RPM_HASH = "4cf6893f039b53cbd8399a9c4e3635d14212ed11aee0596572bff617e0a5d105489ba7a32874d54383d4e6801b872edf5c663658f87ea40cc727f3a8a00e6a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hecthese.cls \
texlive-hecthese"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-calc.sty \
tex-chapterbib.sty \
tex-color.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-memoir.cls \
tex-natbib.sty \
tex-numprint.sty \
tex-tocvsec2.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
