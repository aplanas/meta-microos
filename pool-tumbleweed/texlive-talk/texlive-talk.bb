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

PV = "2023.201.1.1svn42428"

RPM_NAME = "texlive-talk-2023.201.1.1svn42428-54.1.noarch.rpm"
RPM_HASH = "1c6a43ab56cd1391e4e875a5f08707d1f3933083f242294810088fa4f205c605205f46578a8a73b2817027b98b32c31f99797ab90f2f35a6e4e6c83847898400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sidebars.sty \
tex-talk.cls \
texlive-talk"

RDEPENDS:${PN} += "/bin/sh \
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
