SUMMARY = "A LaTeX class for presentations"
DESCRIPTION = "The talk document class allows you to create slides for screen \
presentations or printing on transparencies. It also allows you \
to print personal notes for your talk. You can create overlays \
and display structure information (current section / \
subsection, table of contents) on your slides. The main feature \
that distinguishes talk from other presentation classes like \
beamer or prosper is that it allows the user to define an \
arbitrary number of slide styles and switch between these \
styles from slide to slide. This way the slide layout can be \
adapted to the slide content. For example, the title or \
contents page of a talk can be given a slightly different \
layout than the other slides. The talk class makes no \
restrictions on the slide design whatsoever. The entire look \
and feel of the presentation can be defined by the user. The \
style definitions should be put in a separate sty file. \
Currently the package comes with only one set of pre-defined \
slide styles (greybars.sty). Contributions from people who are \
artistically more gifted than the author are more than welcome!"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42428"

RPM_NAME = "texlive-talk-2023.209.1.1svn42428-55.1.noarch.rpm"
RPM_HASH = "80a2610635f25f5e5aab9d36b7eba202f80a681e6cebe139407736cdcd94538219b99b2760cda446e90b13224134338c127f438f532b994a367a5ed616616e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sidebars.sty \
tex-talk.cls \
texlive-talk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-graphicx.sty \
tex-hyperref.sty \
tex-multido.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
