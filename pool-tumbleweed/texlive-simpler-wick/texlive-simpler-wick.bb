SUMMARY = "Simpler Wick contractions"
DESCRIPTION = "In every quantum field theory course, there will be a chapter \
about Wick's theorem and how it can be used to convert a very \
large product of many creation and annihilation operators into \
something more tractable and normal ordered. The contractions \
are denoted with a square bracket over the operators which are \
being contracted, which used to be rather annoying to typeset \
in LaTeX as the only other package available was simplewick, \
which is rather unwieldy. This package provides a simpler \
syntax for Wick contractions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn39074"

RPM_NAME = "texlive-simpler-wick-2023.201.1.0.0svn39074-53.1.noarch.rpm"
RPM_HASH = "7dccf60d692b846a7ce0d47121b954723e72507e633dbc346be021b72644f54bf3a3d865b171275dbad1cb5d7643efbe41506e2239ad58aad1801ab1bdbfcecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(simpler-wick.sty) \
texlive-simpler-wick"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgfopts.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
