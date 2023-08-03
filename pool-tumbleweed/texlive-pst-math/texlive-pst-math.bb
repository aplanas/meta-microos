SUMMARY = "Enhancement of PostScript math operators to use with PSTricks"
DESCRIPTION = "PostScript lacks a lot of basic operators such as tan, acos, \
asin, cosh, sinh, tanh, acosh, asinh, atanh, exp (with e base). \
Also (oddly) cos and sin use arguments in degrees. Pst-math \
provides all those operators in a header file pst-math.pro with \
wrappers pst-math.sty and pst-math.tex. In addition, sinc, \
gauss, gammaln and bessel are implemented (only partially for \
the latter). The package is designed essentially to work with \
pst-plot but can be used in whatever PS code (such as PSTricks \
SpecialCoor '!', which is useful for placing labels). The \
package also provides a routine SIMPSON for numerical \
integration and a solver of linear equation systems."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.66svn64732"

RPM_NAME = "texlive-pst-math-2023.209.0.0.66svn64732-53.1.noarch.rpm"
RPM_HASH = "c5fcef1eb43dd9c9293de1ec7afe88dc1bc11d200467ba4f91833c0e7a06d0a8ecc1933809254cd6929191ea8dd1a5d0b451b58b223e1f8b5829b9c9a9571df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-math.sty \
tex-pst-math.tex \
texlive-pst-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-pst-calculate.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
