SUMMARY = "Concrete based OpenType Math font"
DESCRIPTION = "This package provides an OpenType version of the Concrete Math \
font created by Ulrik Vieth in Metafont. 'concmath-otf.sty' is \
a replacement for the original 'concmath.sty' package to be \
used with LuaTeX or XeTeX engines."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.25svn65683"

RPM_NAME = "texlive-concmath-otf-2023.209.0.0.25svn65683-54.1.noarch.rpm"
RPM_HASH = "eba077d8ee5a9cc057f82f7f6584f3ca3e4d4bddfe05d214e3290b2a80c6162e78f060a4cfc42e07a5fe9bd1b62c2d2cc0e4051d3875912fdbd5b39cf7461fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-concmath-otf.sty \
texlive-concmath-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-concmath-otf-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
