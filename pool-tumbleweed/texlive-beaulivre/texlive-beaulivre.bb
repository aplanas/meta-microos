SUMMARY = "Write your books in a colorful way"
DESCRIPTION = "This package provides a LaTeX class for typesetting books with \
a colorful design. Currently, it has native support for Chinese \
(both simplified and traditional), English, French, German, \
Italian, Japanese, Portuguese (European and Brazilian), Russian \
and Spanish typesetting. It compiles with either XeLaTeX or \
LuaLaTeX. This is part of the colorist class series and depends \
on colorist.sty from the colorist package. The package name \
'beaulivre' is taken from the French words 'beau' (= \
'beautiful') and 'livre' (= 'book')."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65475"

RPM_NAME = "texlive-beaulivre-2023.209.svn65475-54.1.noarch.rpm"
RPM_HASH = "f5ec13251fc1f987ebfdc9869f24cabaf1b9539cf4a6d7872c2fab2b53a19ddcdd17f4986ada2cd0ee646867c5ae447eba403c694a7fce5ecb43375158f9cdaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beaulivre.cls \
texlive-beaulivre"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-caption.sty \
tex-colorist.sty \
tex-ctex.sty \
tex-draftwatermark.sty \
tex-embrac.sty \
tex-float.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-indentfirst.sty \
tex-lua-widow-control.sty \
tex-mathpazo.sty \
tex-nowidow.sty \
tex-projlib-font.sty \
tex-regexpatch.sty \
tex-silence.sty \
tex-tikz-cd.sty \
tex-unicode-math.sty \
tex-wrapfig.sty \
texlive \
texlive-colorist \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
