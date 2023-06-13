SUMMARY = "Typeset in the style of 'Book of Common Prayer'"
DESCRIPTION = "This a package for the typesetting of liturgical documents in \
the style of the 1979 'Book of Common Prayer'. It provides \
macros for common liturgical situations (e.g. versicle and \
response, longer prayers, etc.). This package is designed to \
work with the Sabon font, but it is not necessary to run the \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn62240"

RPM_NAME = "texlive-book-of-common-prayer-2023.201.1.1.0svn62240-52.1.noarch.rpm"
RPM_HASH = "dcbaee8317258f0970a271d0387c56ee433242809673144777ee6f8a2bc252280c76fadfb905234ffe3f5afc56fdd555dc89b51935e79d5a4175bc70cb4b3457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(book-of-common-prayer.sty) \
texlive-book-of-common-prayer"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alltt.sty) \
tex(bilingualpages.sty) \
tex(changepage.sty) \
tex(enumitem.sty) \
tex(fontspec.sty) \
tex(framed.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(makecell.sty) \
tex(paracol.sty) \
tex(pgf.sty) \
tex(pgfopts.sty) \
tex(pgfornament.sty) \
tex(titlesec.sty) \
tex(titling.sty) \
tex(tocloft.sty) \
tex(xcolor.sty) \
tex(xtab.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
