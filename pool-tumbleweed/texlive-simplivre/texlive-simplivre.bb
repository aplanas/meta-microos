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

PV = "2023.209.svn65475"

RPM_NAME = "texlive-simplivre-2023.209.svn65475-58.1.noarch.rpm"
RPM_HASH = "c3aa7585ab5c8e70764c6d0cfc4e3883971735db17642c3bc7ff789f68fb1e835d92cb6c6f838acd0ec2de8894f0030b2b4c7c992d9f02a0bc109ec74778a4ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplivre.cls \
texlive-simplivre"

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
