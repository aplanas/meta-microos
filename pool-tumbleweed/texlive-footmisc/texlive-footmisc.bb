SUMMARY = "A range of footnote options"
DESCRIPTION = "A collection of ways to change the typesetting of footnotes. \
The package provides means of changing the layout of the \
footnotes themselves (including setting them in 'paragraphs' -- \
the para option), a way to number footnotes per page (the \
perpage option), to make footnotes disappear in a 'moving' \
argument (stable option) and to deal with multiple references \
to footnotes from the same place (multiple option). The package \
also has a range of techniques for labelling footnotes with \
symbols rather than numbers. Some of the functions of the \
package are overlap with the functionality of other packages. \
The para option is also provided by the manyfoot and bigfoot \
packages, though those are both also portmanteau packages. \
(Don't be seduced by fnpara, whose implementation is improved \
by the present package.) The perpage option is also offered by \
footnpag and by the rather more general-purpose perpage"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0dsvn62524"

RPM_NAME = "texlive-footmisc-2023.201.6.0dsvn62524-52.1.noarch.rpm"
RPM_HASH = "3ae240b139861b76e2168f889feb4d2ef7743ea002757ca98fa5b6841b26b57bb5124263ba387a02b7ef83c70d55e5e0feee1e674b0e75523a6ad430c1a00695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(footmisc-2011-06-06.sty) \
tex(footmisc.sty) \
texlive-footmisc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(perpage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
