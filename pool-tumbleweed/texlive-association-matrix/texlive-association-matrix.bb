SUMMARY = "LaTeX support for creating association matrices"
DESCRIPTION = "This package allows the creation of association matrices in an \
clear and concise fashion, without having to deal with manually \
generating and modifying the tables while working. All you have \
to do is define the rows and the columns by their unique \
identifier, and then specify which cells should be marked as \
associated. Then, the \\amxgenerate command generates a table \
that shows in the cells with a blip (*) where the association \
was added. The package depends on etoolbox, forloop, ifthen, \
textcomp, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64845"

RPM_NAME = "texlive-association-matrix-2023.209.1.1svn64845-54.1.noarch.rpm"
RPM_HASH = "c941148b1f75ac5bc775656b8bc0c3c36d36f1a2dd07a633e281b88450427e010617d284cb1892b82ad6fa45815bc90bfe4feae57b7d5ff66da4098a156e3649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-association-matrix.sty \
texlive-association-matrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-forloop.sty \
tex-ifthen.sty \
tex-textcomp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
