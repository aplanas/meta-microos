SUMMARY = "Kashida justification in XeLaTeX and LuaLaTeX"
DESCRIPTION = "In some cursive scripts such as Persian or Arabic, kashida is \
used to create justification. In this type of justification \
characters are elongated rather than expanding spaces between \
words. The kashida justification in xepersian has many bugs. \
Also it has problems with some fonts. The xepersian-hm package \
was the first attempt to fix these bugs in xepersian, which \
uses the XeTeX engine. This package extends the kashida \
justification to be used with the LuaTeX engine, too. \
Explanation of the package name: Negar, in Persian, is the \
present stem of negaashtan meaning to design, to paint, to \
write; and as a noun it means 'sweetheart, idol, beloved, \
figuratively referring to a beautiful woman, pattern, painting, \
and artistic design'."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1esvn57692"

RPM_NAME = "texlive-texnegar-2023.209.0.0.1esvn57692-55.1.noarch.rpm"
RPM_HASH = "108c6efd66d1b9a6c7d5f305058e6338fb84a3c9965a2c7de3896acad1310795ee97a9883639b5e0ba3a46116adff07535b57b61772e31b55651855270f10654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texnegar-common-kashida.tex \
tex-texnegar-ini.tex \
tex-texnegar-luatex.sty \
tex-texnegar-xetex-kashida.tex \
tex-texnegar-xetex.sty \
tex-texnegar.sty \
texlive-texnegar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-environ.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-newverbs.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
