SUMMARY = "Write your articles or books in a simple and clear way"
DESCRIPTION = "This package offers you a LaTeX style file and two classes to \
typeset articles or books in a simple and clear way. These \
classes currently have native support for English, French, \
German, Italian, Portuguese (European and Brazilian), and \
Spanish typesetting. They compile with any major TeX engine. \
You may also wish to consider the packages einfart and \
simplivre, which are enhanced versions of the classes provided \
here. They have unicode support, thus can only be used with \
either XeLaTeX or LuaLaTeX. Currently they have native support \
for Chinese (both simplified and traditional), English, French, \
German, Italian, Japanese, Portuguese (European and Brazilian), \
Russian and Spanish typesetting, and also use more beautiful \
fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66434"

RPM_NAME = "texlive-minimalist-2023.209.svn66434-55.1.noarch.rpm"
RPM_HASH = "a521cd5625a1aa5ed16386370722af7666d818d2b3ed3c3eb1975019a2e11f51368352145e9ee28a3be82503de1848bc312d3aaf359e3f9945ded0a34761f6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minimalist-classical.sty \
tex-minimalist-flow.sty \
tex-minimalist-plain.sty \
tex-minimalist-stream.sty \
tex-minimalist.sty \
tex-minimart.cls \
tex-minimbook.cls \
texlive-minimalist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-bookmark.sty \
tex-caption.sty \
tex-draftwatermark.sty \
tex-embrac.sty \
tex-enumitem.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-imakeidx.sty \
tex-indentfirst.sty \
tex-lineno.sty \
tex-lua-widow-control.sty \
tex-mathpazo.sty \
tex-mathtools.sty \
tex-newpxtext.sty \
tex-nowidow.sty \
tex-parskip.sty \
tex-projlib-author.sty \
tex-projlib-draft.sty \
tex-projlib-font.sty \
tex-projlib-language.sty \
tex-projlib-paper.sty \
tex-projlib-theorem.sty \
tex-projlib-titlepage.sty \
tex-regexpatch.sty \
tex-relsize.sty \
tex-silence.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-projlib \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
