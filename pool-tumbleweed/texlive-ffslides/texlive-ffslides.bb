SUMMARY = "Freeform slides based on the article class"
DESCRIPTION = "The ffslides ('freeform slides') class is intended to make it \
easier to place various types of content freely on the page, \
and therefore easier to design documents with a strong visual \
component: presentations, posters, research or lecture notes, \
and so on. The goal of the class is to be less rigid and less \
complex than some of the popular presentation-making options. \
It is essentially a small set of macros added to the article \
class. A well-organized template file is included, and the \
documentation is itself an extensive example of the class's \
capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38895"

RPM_NAME = "texlive-ffslides-2023.209.svn38895-53.1.noarch.rpm"
RPM_HASH = "2547dc12b74e7095073ddd29399e10dd076e9e1205d7aa5c577fe38bb9da1175ed21e4e790371313669f05a7aa978753eeae2762739913c6a9a04aab35cc55da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ffslides.cls \
texlive-ffslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-geometry.sty \
tex-graphics.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-lastpage.sty \
tex-pstricks.sty \
tex-twoopt.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
