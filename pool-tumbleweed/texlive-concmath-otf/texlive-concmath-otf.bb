SUMMARY = "Concrete based OpenType Math font"
DESCRIPTION = "This package provides an OpenType version of the Concrete Math \
font created by Ulrik Vieth in Metafont. 'concmath-otf.sty' is \
a replacement for the original 'concmath.sty' package to be \
used with LuaTeX or XeTeX engines."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.25svn65683"

RPM_NAME = "texlive-concmath-otf-2023.201.0.0.25svn65683-53.1.noarch.rpm"
RPM_HASH = "2d130f1e0523fe41692c43274be9d2b441769f03f218af43bb077626f49540d911839740c34f446894e85b08f84eb05de89ad19363e5ac92d6b6ef2c76d93be2"
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
