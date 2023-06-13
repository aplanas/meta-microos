SUMMARY = "Write your articles in a simple and clear way"
DESCRIPTION = "This package provides a LaTeX class for typesetting articles \
with a simple and clear design. Currently, it has native \
support for Chinese (simplified and traditional), English, \
French, German, Italian, Japanese, Portuguese (European and \
Brazilian), Russian and Spanish typesetting. It compiles with \
either XeLaTeX or LuaLaTeX. This is part of the minimalist \
class series and depends on minimalist.sty from the minimalist \
package. The package name 'einfart' is taken from the German \
word 'einfach' ('simple'), combined with the first three \
letters of 'Artikel' ('article')."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-einfart-2023.201.svn65475-53.1.noarch.rpm"
RPM_HASH = "f64bbf1835d15a458a43ead5bb41fd6b1420875b6307459de5b45e43164e369f80a19ad5ea0a44037c9d2d6028d428ee998cb96851926d1b3a555b72cf288802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(einfart.cls) \
texlive-einfart"

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
