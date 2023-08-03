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

PV = "2023.209.1.0.0svn39074"

RPM_NAME = "texlive-simpler-wick-2023.209.1.0.0svn39074-54.1.noarch.rpm"
RPM_HASH = "5a5be760bacd483926256d40a1ad7330febceb0243e7cb8e09a95b42fdf4fa5956bee7fc7b03f7da5a0fc2d7c082b99805c70cea619b2ca9fabb792e7f23ff8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simpler-wick.sty \
texlive-simpler-wick"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
