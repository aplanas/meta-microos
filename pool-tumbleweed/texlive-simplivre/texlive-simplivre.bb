SUMMARY = "Write your books in a simple and clear way"
DESCRIPTION = "This package provides a LaTeX class for typesetting books with \
a simple and clear design. Currently, it has native support for \
Chinese (simplified and traditional), English, French, German, \
Italian, Japanese, Portuguese (European and Brazilian), Russian \
and Spanish typesetting. It compiles with either XeLaTeX or \
LuaLaTeX. This is part of the minimalist class series and \
depends on minimalist.sty from the minimalist package. The \
package name 'simplivre' is taken from the French words \
'simple' and 'livre' (= 'book')."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-simplivre-2023.201.svn65475-57.1.noarch.rpm"
RPM_HASH = "c4e3f4f53601da9298db31d7b172bc14a8eeb0ceb0b0a4ad81dc1eb066a1fe4d9485902b4cab14dc2acaa5e770ca87383aa60be04f8521fa24bc12459fd4ef44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(simplivre.cls) \
texlive-simplivre"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(caption.sty) \
tex(ctex.sty) \
tex(draftwatermark.sty) \
tex(embrac.sty) \
tex(float.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(indentfirst.sty) \
tex(lua-widow-control.sty) \
tex(mathpazo.sty) \
tex(minimalist.sty) \
tex(nowidow.sty) \
tex(parskip.sty) \
tex(projlib-font.sty) \
tex(regexpatch.sty) \
tex(silence.sty) \
tex(tikz-cd.sty) \
tex(unicode-math.sty) \
tex(wrapfig.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-minimalist \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
