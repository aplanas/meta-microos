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

RPM_NAME = "texlive-einfart-2023.201.svn65475-53.2.noarch.rpm"
RPM_HASH = "e59a05a1ff0162eb5f205e70becfca6c25c9f4b3d82b7f871cfc6c59d71e04b6c0871e9dc5718ab069785b43bdcaa0aff8ea52b42fc4b5b75a986a7a2abfd9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-einfart.cls \
texlive-einfart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-caption.sty \
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
tex-minimalist.sty \
tex-nowidow.sty \
tex-parskip.sty \
tex-projlib-font.sty \
tex-regexpatch.sty \
tex-silence.sty \
tex-tikz-cd.sty \
tex-unicode-math.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-minimalist \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
