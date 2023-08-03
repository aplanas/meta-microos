SUMMARY = "An Arabic book class"
DESCRIPTION = "This document class provides both Arabic and English support \
for TeX/LaTeX. Input may be in ASCII transliteration or other \
encodings (including UTF-8), and output may be Arabic, Hebrew, \
or any of several languages that use the Arabic script, as can \
be specified by the polyglossia package. The Arabic font is \
presently available in any Arabic fonts style. In order to use \
Amiri font style, the user needs to install the amiri package. \
This document class runs with the XeTeX engine. PDF files \
generated using this class can be searched, and text can be \
copied from them and pasted elsewhere."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59594"

RPM_NAME = "texlive-arabic-book-2023.209.1.0svn59594-55.1.noarch.rpm"
RPM_HASH = "87dc6312faa4bb7eb0cb591c1eaa025cdca39d67473263e597685608521c09ef4073c35aa6e680de63f76d51e3ae2e8fd76ddcdee8342d6d2a64d7d2345c9be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arabic-book.cls \
texlive-arabic-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-book.cls \
tex-caption.sty \
tex-collcell.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-newfloat.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-totalcount.sty \
tex-xwatermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
