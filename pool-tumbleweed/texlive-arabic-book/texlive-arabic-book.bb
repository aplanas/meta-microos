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

PV = "2023.201.1.0svn59594"

RPM_NAME = "texlive-arabic-book-2023.201.1.0svn59594-54.1.noarch.rpm"
RPM_HASH = "bf1fc1d5b62382fb461d13f4fac7b9363fc557e4cbc89797c959eb95a4c0aec5afa293d06d62f877bb8741dcd2050affc47b11dd8617bf149c802ff7f3e33504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arabic-book.cls) \
texlive-arabic-book"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(book.cls) \
tex(caption.sty) \
tex(collcell.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(float.sty) \
tex(geometry.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(indentfirst.sty) \
tex(newfloat.sty) \
tex(polyglossia.sty) \
tex(setspace.sty) \
tex(tikz.sty) \
tex(titlesec.sty) \
tex(titling.sty) \
tex(tocbibind.sty) \
tex(tocloft.sty) \
tex(totalcount.sty) \
tex(xwatermark.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
