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

PV = "2023.201.0.0.66svn64732"

RPM_NAME = "texlive-pst-math-2023.201.0.0.66svn64732-52.1.noarch.rpm"
RPM_HASH = "64c39270997a4e543d52e2f3268a609a2cf89e1535413b1cb604c102e9432b71ed09f3a518733db6121216f67533a032c7186f94001c2a2efbacdf6f8d87f7ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-math.sty \
tex-pst-math.tex \
texlive-pst-math"

RDEPENDS:${PN} += "/bin/sh \
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
