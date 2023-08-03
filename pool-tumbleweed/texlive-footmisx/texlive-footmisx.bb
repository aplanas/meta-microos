SUMMARY = "A range of footnote options"
DESCRIPTION = "This a fork of footmisc package allowing to use hyperref. Here \
is a copy of the description of package footmisc: A collection \
of ways to change the typesetting of footnotes. The package \
provides means of changing the layout of the footnotes \
themselves (including setting them in 'paragraphs' -- the para \
option), a way to number footnotes per page (the perpage \
option), to make footnotes disappear in a 'moving' argument \
(stable option) and to deal with multiple references to \
footnotes from the same place (multiple option). The package \
also has a range of techniques for labelling footnotes with \
symbols rather than numbers. Some of the functions of the \
package are overlap with the functionality of other packages. \
The para option is also provided by the manyfoot and bigfoot \
packages, though those are both also portmanteau packages. \
(Don't be seduced by fnpara, whose implementation is improved \
by the present package.) The perpage option is also offered by \
footnpag and by the rather more general-purpose perpage"
LICENSE = "LPPL-1.0"

PV = "2023.209.20161201svn42621"

RPM_NAME = "texlive-footmisx-2023.209.20161201svn42621-53.1.noarch.rpm"
RPM_HASH = "06b714708087d99805ca244d7ac0710db2ee050cd15a006129a13427d12beba38e39bcfe2f451d564297ceb8941798be095fb89598c026131606965313d8f7a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footmisx.sty \
texlive-footmisx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
