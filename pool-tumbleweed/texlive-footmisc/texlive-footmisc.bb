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

PV = "2023.209.6.0dsvn62524"

RPM_NAME = "texlive-footmisc-2023.209.6.0dsvn62524-53.1.noarch.rpm"
RPM_HASH = "0ac324587a1e9931b7b26ebcf4f12a9ae075f38d2a48f75a7d91fd5e16984b20efe91f6a732988dd87a7494d78c446fbefaf005f7a8857794172233fccab8d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footmisc-2011-06-06.sty \
tex-footmisc.sty \
texlive-footmisc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
