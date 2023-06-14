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

PV = "2023.201.svn38895"

RPM_NAME = "texlive-ffslides-2023.201.svn38895-52.1.noarch.rpm"
RPM_HASH = "316a635da465816a6e0e196f92def0128089474c1d0ac11ef3f5ffe53f23c6760956c6f2388cc70efc5be8e72a12dfd5eb9a6ca5adb4cdfade6d6f0d2ea9d5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ffslides.cls \
texlive-ffslides"

RDEPENDS:${PN} += "/bin/sh \
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
