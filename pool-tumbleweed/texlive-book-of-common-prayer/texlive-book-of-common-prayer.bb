SUMMARY = "Typeset in the style of 'Book of Common Prayer'"
DESCRIPTION = "This a package for the typesetting of liturgical documents in \
the style of the 1979 'Book of Common Prayer'. It provides \
macros for common liturgical situations (e.g. versicle and \
response, longer prayers, etc.). This package is designed to \
work with the Sabon font, but it is not necessary to run the \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn62240"

RPM_NAME = "texlive-book-of-common-prayer-2023.209.1.1.0svn62240-53.1.noarch.rpm"
RPM_HASH = "d4cbdaace7398dff204e9d69e54c67edbf629f0ff75d538b3ebb03bbc5b3c731f44996fbf04b9b39ad78ef9a6340e372039135cbea79cac7ced5b521ef2e62ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-book-of-common-prayer.sty \
texlive-book-of-common-prayer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alltt.sty \
tex-bilingualpages.sty \
tex-changepage.sty \
tex-enumitem.sty \
tex-fontspec.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-makecell.sty \
tex-paracol.sty \
tex-pgf.sty \
tex-pgfopts.sty \
tex-pgfornament.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xtab.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
