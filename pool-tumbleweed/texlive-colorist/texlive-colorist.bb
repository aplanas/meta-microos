SUMMARY = "Write your articles or books in a colorful way"
DESCRIPTION = "This package offers you a LaTeX style file and two classes to \
typeset articles or books in a colorful way. These classes \
currently have native support for English, French, German, \
Italian, Portuguese (European and Brazilian), and Spanish \
typesetting. They compile with any major TeX engine. You may \
also wish to consider the packages lebhart and beaulivre, which \
are enhanced versions of the classes provided here. They have \
unicode support, thus can only be used with either XeLaTeX or \
LuaLaTeX. Currently they have native support for Chinese (both \
simplified and traditional), English, French, German, Italian, \
Japanese, Portuguese (European and Brazilian), Russian and \
Spanish typesetting, and also use more beautiful fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66434"

RPM_NAME = "texlive-colorist-2023.209.svn66434-54.1.noarch.rpm"
RPM_HASH = "c3a30a4e8b24e98e03e63e5cc79f6fb9bb50ae9cf7bbe80fc8abdf4eb9415272133f7819f1b0c2f5ae915a4238d83301f60d9eb8b3e519ed3f0500f5a6980ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorart.cls \
tex-colorbook.cls \
tex-colorist-fancy.sty \
tex-colorist.sty \
texlive-colorist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
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
tex-ifoddpage.sty \
tex-iftex.sty \
tex-imakeidx.sty \
tex-indentfirst.sty \
tex-lua-widow-control.sty \
tex-marginnote.sty \
tex-mathpazo.sty \
tex-mathtools.sty \
tex-newpxtext.sty \
tex-nowidow.sty \
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
